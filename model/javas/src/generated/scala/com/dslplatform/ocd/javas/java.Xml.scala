package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaXml
    extends OcdJavaBoxType
    with `type.Xml` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = false
}

case object `java.Xml`
    extends JavaXml with `box.One` {

  val javaClass = "org.w3c.dom.Element"
  val javaType = JavaSimpleType("org.w3c.dom.Element")
  val javaDescription = "OneXml"

  def defaultValue = DisallowedNullValue

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
  )

  val hasGenerics = false
}

case object `java.Xml?`
    extends JavaXml with `box.Nullable` {

  val javaClass = "org.w3c.dom.Element"
  val javaType = JavaSimpleType("org.w3c.dom.Element")
  val javaDescription = "NullableXml"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
  , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
  )

  val hasGenerics = false
}

case object `java.Xml[]`
    extends JavaXml with `box.OneArrayOfOne` {

  val javaClass = "org.w3c.dom.Element[]"
  val javaType = JavaSimpleType("org.w3c.dom.Element[]")
  val javaDescription = "OneArrayOfOneXmls"

  def defaultValue = SingleJavaValue("new org.w3c.dom.Element[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = false
}

case object `java.Xml[]?`
    extends JavaXml with `box.NullableArrayOfOne` {

  val javaClass = "org.w3c.dom.Element[]"
  val javaType = JavaSimpleType("org.w3c.dom.Element[]")
  val javaDescription = "NullableArrayOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = false
}

case object `java.Xml?[]`
    extends JavaXml with `box.OneArrayOfNullable` {

  val javaClass = "org.w3c.dom.Element[]"
  val javaType = JavaSimpleType("org.w3c.dom.Element[]")
  val javaDescription = "OneArrayOfNullableXmls"

  def defaultValue = SingleJavaValue("new org.w3c.dom.Element[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = false
}

case object `java.Xml?[]?`
    extends JavaXml with `box.NullableArrayOfNullable` {

  val javaClass = "org.w3c.dom.Element[]"
  val javaType = JavaSimpleType("org.w3c.dom.Element[]")
  val javaDescription = "NullableArrayOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ArrayOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Xml>`
    extends JavaXml with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneListOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Xml>?`
    extends JavaXml with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableListOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Xml?>`
    extends JavaXml with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneListOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Xml?>?`
    extends JavaXml with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableListOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , ListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Xml>`
    extends JavaXml with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneSetOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Xml>?`
    extends JavaXml with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableSetOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Xml?>`
    extends JavaXml with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneSetOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.HashSet<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Xml?>?`
    extends JavaXml with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableSetOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , SetOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Xml>`
    extends JavaXml with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneQueueOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Xml>?`
    extends JavaXml with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableQueueOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Xml?>`
    extends JavaXml with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneQueueOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Xml?>?`
    extends JavaXml with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableQueueOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , QueueOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Xml>`
    extends JavaXml with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneLinkedListOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.w3c.dom.Element>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Xml>?`
    extends JavaXml with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableLinkedListOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Xml?>`
    extends JavaXml with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneLinkedListOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<org.w3c.dom.Element>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Xml?>?`
    extends JavaXml with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableLinkedListOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , LinkedListOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Xml>`
    extends JavaXml with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneStackOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.w3c.dom.Element>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Xml>?`
    extends JavaXml with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableStackOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Xml?>`
    extends JavaXml with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneStackOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.Stack<org.w3c.dom.Element>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Xml?>?`
    extends JavaXml with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableStackOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , StackOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Xml>`
    extends JavaXml with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneVectorOfOneXmls"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Xml>?`
    extends JavaXml with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableVectorOfOneXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Xml?>`
    extends JavaXml with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "OneVectorOfNullableXmls"

  def defaultValue = SingleJavaValue("new java.util.Vector<org.w3c.dom.Element>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Xml?>?`
    extends JavaXml with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<org.w3c.dom.Element>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("org.w3c.dom.Element"))
  val javaDescription = "NullableVectorOfNullableXmls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  , VectorOfJavaValues("org.w3c.dom.Element",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<document/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<TextElement>some text &amp; &lt;stuff&gt;</TextElement>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<AtributedElement foo=\\\"bar\\\" qwe=\\\"poi\\\"/>\")")
    , SingleJavaValue("com.dslplatform.ocd.test.Utils.stringToElement(\"<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>\")")
    )
  )

  val hasGenerics = true
}
