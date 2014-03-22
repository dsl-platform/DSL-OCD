package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = "null"

  val nonDefaultValues = Seq(
    /* Element */
        E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createElement("OneElement")"""
/*
    /* Attribute */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createAttribute("OneElementWithAnAttribute")"""
    /* Text */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createTextNode("OneElementHoldingATextNode")"""
    /* CData */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createCDATASection("OneElementWithACDataSection")"""
*/
  )
}
