import java.io.PrintStream
import java.net.{InetAddress, Socket}

import scala.io.BufferedSource

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object Menu {
  def main(args: Array[String]): Unit = {
    while (true){
      println("\n1. Agregar")
      println("2. Modificar")
      println("3. Buscar")
      println("4. Listar")
      println("5. Salir")
      print("Ingrese su opcion: ")

      val opcion = scala.io.StdIn.readInt()

      opcion match {
        case 1  => OpcionesDeMenu.agregar()
        case 2  => OpcionesDeMenu.Modificar()
        case 3  => OpcionesDeMenu.Buscar()
        case 4  => OpcionesDeMenu.Listar()
        case 5  => sys.exit()
        case whoa  => println("Unexpected case: " + whoa.toString)
      }
    }
  }
}
