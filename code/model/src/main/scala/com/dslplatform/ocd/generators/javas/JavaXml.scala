package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaXml
    extends JavaStub {

  val classReference = "org.w3c.dom.Element"

  val defaultSingle: TestValue = E"com.dslplatform.ocd.test.Utils.stringToElement(${<empty/>})"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.ocd.test.Utils.stringToElement(${<TextElement>some text &amp; &lt;stuff&gt;</TextElement>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<ElementWithCData><![CDATA[<?xml?><xml><!xml!>]]></ElementWithCData>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<AtributedElement foo="bar" qwe="poi"/>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>})"
  , E"com.dslplatform.ocd.test.Utils.stringToElement(${<ns3000:NamespacedElement/>})"
  )
}
