package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = "null"

  val nonDefaultValues = Seq(
    E"com.dslplatform.client.TypeFactory.buildElement(${"<EmptyElement/>"})"
  , E"com.dslplatform.client.TypeFactory.buildElement(${"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>"})"
  , E"com.dslplatform.client.TypeFactory.buildElement(${"<ElementWithCData><![CDATA[<?xml?><xml><!xml!>]]></ElementWithCData>"})"
  , E"com.dslplatform.client.TypeFactory.buildElement(${"""<AtributedElement foo="bar" qwe="poi"/>"""})"
  , E"com.dslplatform.client.TypeFactory.buildElement(${"<ns3000:NamespacedElement/>"})"
  )
}
