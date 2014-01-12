package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaXml
    extends OcdJava
    with `type.Xml`

case object `java.Xml`
    extends JavaXml with `box.One` {

  val javaClass = "org.w3c.dom.Element"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Xml[]`
    extends JavaXml with `box.OneArrayOfOne` {

  val javaClass = "org.w3c.dom.Element[]"

  val defaultValue = "new org.w3c.dom.Element[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Xml?[]`
    extends JavaXml with `box.OneArrayOfNullable` {

  val javaClass = "org.w3c.dom.Element[]"

  val defaultValue = "new org.w3c.dom.Element[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Xml>`
    extends JavaXml with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"

  val defaultValue = "new java.util.ArrayList<org.w3c.dom.Element>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Xml?>`
    extends JavaXml with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"

  val defaultValue = "new java.util.ArrayList<org.w3c.dom.Element>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Xml>`
    extends JavaXml with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"

  val defaultValue = "new java.util.HashSet<org.w3c.dom.Element>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Xml?>`
    extends JavaXml with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"

  val defaultValue = "new java.util.HashSet<org.w3c.dom.Element>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Xml?`
    extends JavaXml with `box.Nullable` {

  val javaClass = "org.w3c.dom.Element"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Xml[]?`
    extends JavaXml with `box.NullableArrayOfOne` {

  val javaClass = "org.w3c.dom.Element[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Xml?[]?`
    extends JavaXml with `box.NullableArrayOfNullable` {

  val javaClass = "org.w3c.dom.Element[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Xml>?`
    extends JavaXml with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Xml?>?`
    extends JavaXml with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.w3c.dom.Element>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Xml>?`
    extends JavaXml with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Xml?>?`
    extends JavaXml with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.w3c.dom.Element>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
