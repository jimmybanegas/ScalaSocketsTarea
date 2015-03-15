import scala.util.Random

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
class Empleado(nom: String, mail: String,salario: String, id: String,tel: String){
  var codigo : String = this.getNextCodigo();
  var nombre : String = nom;
  var correo : String = mail;
  var sueldo : String = salario;
  var identidad : String = id;
  var telefono : String = tel;

  override def toString(): String = codigo+" "+nombre+" "+correo+" "+sueldo+" "+identidad+" "+telefono

  def getNextCodigo() : String = {
    var r = Random.alphanumeric.take(4).mkString.toUpperCase;

    return r;
  }
}
