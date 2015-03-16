import scala.xml.XML

/**
 * Created by Affisa-Jimmy on 13/03/2015.
 */


object TasaDeCambio {
  def getTasa() : Double = {
    val in = scala.io.Source.fromURL("https://www.bac.net/exchangerate/showXmlExchangeRate.do?company=BCO")
    val xml = XML.load("https://www.bac.net/exchangerate/showXmlExchangeRate.do?company=BCO")
    //println(xml)

    val items = xml \ "country"
    val prices = items.map(i => (i \ "saleRateUSD").text.toDouble)
    //for (line <- in.getLines)

    return prices.toList.apply(3)

  }

}
