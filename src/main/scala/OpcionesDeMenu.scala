import scala.xml.dtd.ValidationException

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object OpcionesDeMenu {

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

     println(emp.toString());
    }

  }
}
