import scala.util.Random
import scala.xml.dtd.ValidationException

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object OpcionesDeMenu {
  def Listar(): Unit = {
    println(TasaDeCambio.getTasa().toString)

    val resp = Cliente.iniciarCliente("Listar\n")
    resp.split("-").foreach(e => println(e))
  }

  def Buscar(): Unit = {
    print("Ingrese código que busca : " )

    val codigo = Console.in.readLine()

    val resp = Cliente.iniciarCliente("Buscar\n"+codigo.toString)

    println(resp)

  }

  def Modificar(): Unit = {
    print("Ingrese código que modificará : " )
    val codigo = Console.in.readLine()

    val resp : String = Cliente.iniciarCliente("Buscar\n"+codigo.toString)

    if(resp!= "No existe"){

      println("Ingrese nombre: ")
      val nombre = scala.io.StdIn.readLine().toString
      println("Ingrese correo: ")
      val correo = scala.io.StdIn.readLine()
      println("Ingrese salario: ")
      val salario = scala.io.StdIn.readLine()
      println("Ingrese identidad: ")
      val identidad = scala.io.StdIn.readLine()
      println("Ingrese telefono: ")
      val telefono = scala.io.StdIn.readLine()

      if(Validaciones.correoEsValido(correo) && Validaciones.nombreEsValido(nombre) &&
        Validaciones.salarioEsValido(salario) && Validaciones.identidadEsValida(identidad) && Validaciones.telefonoEsValido(telefono)){

        val emp = new Empleado(resp.substring(0,4),nombre,correo,salario,identidad,telefono);

        val r_back: String = Cliente.iniciarCliente("Modificar\n"+resp+"\n"+emp.toString())
        println(r_back)
      }
      else
      {
        println("Datos con formato incorrecto");
      }
    }
    else{
      println(resp)
    }
  }

  def agregar ()  ={
    println("Ingrese nombre: ")
    val nombre = scala.io.StdIn.readLine().toString
    println("Ingrese correo: ")
    val correo = scala.io.StdIn.readLine()
    println("Ingrese salario: ")
    val salario = scala.io.StdIn.readLine()
    println("Ingrese identidad: ")
    val identidad = scala.io.StdIn.readLine()
    println("Ingrese telefono: ")
    val telefono = scala.io.StdIn.readLine()

   if(Validaciones.correoEsValido(correo) && Validaciones.nombreEsValido(nombre) &&
        Validaciones.salarioEsValido(salario) && Validaciones.identidadEsValida(identidad) && Validaciones.telefonoEsValido(telefono)){

       val emp = new Empleado(this.getNextCodigo(),nombre,correo,salario,identidad,telefono);

       val resp = Cliente.iniciarCliente("Agregar\n"+emp.toString())

       println(resp)

    }
      else
     {
       println("Datos con formato incorrecto");
     }
  }

  def getNextCodigo() : String = {
    var r = Random.alphanumeric.take(4).mkString.toUpperCase;

    return r;
  }

}
