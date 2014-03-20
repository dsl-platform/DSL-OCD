package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = "javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().getDocumentElement()"

  // FIXME
  val nonDefaultValues = Seq(

    /* Element */
        E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createElement("anElement")"""
    /* Attribute */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createAttribute("anAttribute")"""
    /* Text */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createTextNode("aTextNode")"""
    /* CData */
      , E"""javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().createCDATASection("aCDataSection")"""
  )
}
