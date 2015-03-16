/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */

import java.net._
import java.io._
import scala.io._

object Servidor {
  // Simple server
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    while (true) {
      val s = server.accept()
      val in = new BufferedSource(s.getInputStream()).getLines()
      val out = new PrintStream(s.getOutputStream())

      val op = in.next()

      println(op)

      var resp = ""

      if(op == "Agregar")
         Archivos.escribir(in.next())
      else if(op == "Buscar"){
        resp = Archivos.buscar(in.next())
      }else if (op=="Listar"){
        resp = Archivos.listar()
      }else if( op == "Modificar"){
        Archivos.editar(in.next(),in.next())
      }

      out.println(resp)
      out.flush()
      s.close()
    }
  }
}
