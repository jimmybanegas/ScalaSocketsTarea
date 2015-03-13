import java.io.PrintStream
import java.net.{InetAddress, Socket}

import scala.io.BufferedSource

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object Menu {
  def main(args: Array[String]): Unit = {
    while (true){
      println("1. Agregar")
      println("2. Buscar")
      println("3. Listar")
      println("4. Modificar")
      println("5. Salir")
      println("Ingrese su opcion")

      val opcion = scala.io.StdIn.readInt()

      opcion match {
        case 1  => OpcionesDeMenu.agregar()
        case 2  => println("February")
        case 3  => println("March")
        case 4  => println("April")
        case 5  => sys.exit()
        case whoa  => println("Unexpected case: " + whoa.toString)
      }
    }
  }
}
