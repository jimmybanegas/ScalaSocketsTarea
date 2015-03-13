/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object Vaidaciones {

  def correoEsValido(correo : String ) : Boolean = {
    if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(correo) == None)false else true
  }

  def identidadEsValida(identidad : String ) : Boolean = {
    return false
  }

  def telefonoEsValido(telefono : Int ) : Boolean = {
    return false
  }

  def salarioEsValido(salario : Double ) : Boolean = {
    return false
  }

  def codigoEsValido(codigo : String ) : Boolean = {
    return false
  }

  def nombreEsValido(nombre : String ) : Boolean = {
    return false
  }

}
