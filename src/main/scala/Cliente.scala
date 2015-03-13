/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
import java.net._
import java.io._
import scala.io._


object Cliente {
  // Simple client
  def main(args: Array[String]): Unit = {
    val s = new Socket(InetAddress.getByName("localhost"), 9999)
    lazy val in = new BufferedSource(s.getInputStream()).getLines()
    val out = new PrintStream(s.getOutputStream())

    out.println("Hello, world")
    out.flush()
    println("Received: " + in.next())

    s.close()
  }
}
