import java.io._
import java.util

import scala.io.Source


/**
 * Created by Jimmy Banegas on 15/03/2015.
 */
object Archivos {

  def escribir (empleado: String)= {
    val writer = new PrintWriter(new FileWriter("Empleados.txt",true))
    writer.write(empleado+"\r\n")
    writer.close()
  }

  def  buscar (codigo: String):String= {
    for(line <- Source.fromFile("Empleados.txt").getLines()){
     if (line.substring(0,4).equals(codigo))
        return (line)
    }
    return  "No existe"
  }

  def editar (anterior:String,nuevo:String) = {
    val f = new RandomAccessFile(new File("Empleados.txt"), "rw");
    f.seek(0);

    val ans = for (line <- Source.fromFile("Empleados.txt").getLines)
        f.write((line.replace(anterior, nuevo)+"\r\n").getBytes())

    f.close()
  }

  def listar (): String= {
    var lines = ""
    for(line <- Source.fromFile("Empleados.txt").getLines())
      lines+=line+"-"

    return lines
  }

  def esRepetido(parametro:String) :String  =  {
    for(line <- Source.fromFile("Empleados.txt").getLines())
      if (line.contains(parametro))
        return "Repetido"

    return  ""
  }

}
