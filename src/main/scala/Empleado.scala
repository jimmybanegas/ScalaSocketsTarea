import scala.util.Random

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
class Empleado(cod:String,nom: String, mail: String,salario: String, id: String,tel: String){
  var codigo : String = cod;
  var nombre : String = nom;
  var correo : String = mail;
  var sueldo : String = salario;
  var identidad : String = id;
  var telefono : String = tel;

  override def toString(): String = codigo+" "+nombre+" "+correo+" "+sueldo+" "+identidad+" "+telefono

}
