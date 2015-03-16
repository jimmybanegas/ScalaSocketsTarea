import scala.xml.dtd.ValidationException

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object OpcionesDeMenu {
  def Listar(): Unit = {

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
    Archivos.editar("PBGS ghjkl ghjk dfghjkl@bnmp.km 852 15061992004756 52456312","NUEVO")
  }


  def agregar () ={
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

       val emp = new Empleado(nombre,correo,salario,identidad,telefono);

       val resp = Cliente.iniciarCliente("Agregar\n"+emp.toString())

       println(resp)

    }
      else
     {
       println("Datos con formato incorrecto");
     }

  }
}
