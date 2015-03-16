/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */
object Validaciones {

  def correoEsValido(correo : String ) : Boolean = {
    val resp : String = Cliente.iniciarCliente("EsRepetido\n"+correo.toString)

    if(resp == "Repetido")
      return false

    if("""(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(correo) == None)false else true
  }

  def identidadEsValida(identidad : String ) : Boolean = {
    val resp : String = Cliente.iniciarCliente("EsRepetido\n"+identidad.toString)

    if(resp == "Repetido")
      return false

    if("""([0-9]{13})""".r.findFirstIn(identidad) == None)false else true
  }

  def telefonoEsValido(telefono : String ) : Boolean = {
    val resp : String = Cliente.iniciarCliente("EsRepetido\n"+telefono.toString)

    if(resp == "Repetido")
      return false

    if("""([0-9]{8})""".r.findFirstIn(telefono) == None)false else true
  }

  def salarioEsValido(salario : String ) : Boolean = {
    if("""([-+]?(\d*[.])?\d+)""".r.findFirstIn(salario) == None)false else true
  }

  def codigoEsValido(codigo : String ) : Boolean = {
    val resp : String = Cliente.iniciarCliente("EsRepetido\n"+codigo.toString)

    if(resp == "Repetido")
      return false

    if("""([A-Z]{2}[0-9]{2})""".r.findFirstIn(codigo) == None)false else true
  }

  def nombreEsValido(nombre : String ) : Boolean = {
    val resp : String = Cliente.iniciarCliente("EsRepetido\n"+nombre.toString)

    if(resp == "Repetido")
      return false

    if("""([A-Za-záéíóúñ]{2,}([\s][A-Za-záéíóúñ]{2,}))""".r.findFirstIn(nombre) == None)false else true
  }

}
