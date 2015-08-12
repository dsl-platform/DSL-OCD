package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle = DisallowedNullValue

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.ocd.test.Utils.stringToElement(${<document/>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<TextElement>some text &amp; &lt;stuff&gt;</TextElement>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<ElementWithCData><![CDATA[<?xml?><xml><!xml!>]]></ElementWithCData>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<AtributedElement foo="bar" qwe="poi"/>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>})"
//  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<ns3000:NamespacedElement/>})" // Server cannot deserialize namespaced elements ('ns3000' is an undeclared prefix)
  )
}
