import scala.xml.XML

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */


object TasaDeCambio {
  def getTasa() : Double = {
    val xml = XML.load("https://www.bac.net/exchangerate/showXmlExchangeRate.do?company=BCO")
    //println(xml)
    val items = xml \ "country"

    val prices = items.map(i => (i \ "saleRateUSD").text.toDouble)

    return prices.toList.apply(3)

  }
}
