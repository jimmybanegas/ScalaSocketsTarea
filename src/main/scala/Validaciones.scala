/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object Validaciones {

  def correoEsValido(correo : String ) : Boolean = {
    if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(correo) == None)false else true
  }

  def identidadEsValida(identidad : String ) : Boolean = {
    if("""([0-9]{13})""".r.findFirstIn(identidad) == None)false else true
  }

  def telefonoEsValido(telefono : String ) : Boolean = {
    if("""([0-9]{8})""".r.findFirstIn(telefono) == None)false else true
  }

  def salarioEsValido(salario : String ) : Boolean = {
    if("""([-+]?(\d*[.])?\d+)""".r.findFirstIn(salario) == None)false else true
  }

  def codigoEsValido(codigo : String ) : Boolean = {
    if("""([A-Z]{2}[0-9]{2})""".r.findFirstIn(codigo) == None)false else true
  }

  def nombreEsValido(nombre : String ) : Boolean = {
    if("""([A-Za-záéíóúñ]{2,}([\s][A-Za-záéíóúñ]{2,}))""".r.findFirstIn(nombre) == None)false else true
  }

}
