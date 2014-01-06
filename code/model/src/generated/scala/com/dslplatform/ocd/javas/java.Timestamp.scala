package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaTimestamp`
    extends OcdJava
    with `type.Timestamp`

case object `java.Timestamp`
    extends `JavaTimestamp` with `box.One` {

  val javaClass = "org.joda.time.DateTime"

  val defaultValue = "org.joda.time.DateTime.now()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Timestamp[]`
    extends `JavaTimestamp` with `box.OneArrayOfOne` {

  val javaClass = "org.joda.time.DateTime[]"

  val defaultValue = "new org.joda.time.DateTime[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Timestamp?[]`
    extends `JavaTimestamp` with `box.OneArrayOfNullable` {

  val javaClass = "org.joda.time.DateTime[0]"

  val defaultValue = "new org.joda.time.DateTime[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Timestamp>`
    extends `JavaTimestamp` with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"

  val defaultValue = "new java.util.ArrayList<org.joda.time.DateTime>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Timestamp?>`
    extends `JavaTimestamp` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"

  val defaultValue = "new java.util.ArrayList<org.joda.time.DateTime>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Timestamp>`
    extends `JavaTimestamp` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"

  val defaultValue = "new java.util.HashSet<org.joda.time.DateTime>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Timestamp?>`
    extends `JavaTimestamp` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"

  val defaultValue = "new java.util.HashSet<org.joda.time.DateTime>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Timestamp?`
    extends `JavaTimestamp` with `box.Nullable` {

  val javaClass = "org.joda.time.DateTime"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Timestamp[]?`
    extends `JavaTimestamp` with `box.NullableArrayOfOne` {

  val javaClass = "org.joda.time.DateTime[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Timestamp?[]?`
    extends `JavaTimestamp` with `box.NullableArrayOfNullable` {

  val javaClass = "org.joda.time.DateTime[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Timestamp>?`
    extends `JavaTimestamp` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Timestamp?>?`
    extends `JavaTimestamp` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.DateTime>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Timestamp>?`
    extends `JavaTimestamp` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Timestamp?>?`
    extends `JavaTimestamp` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.DateTime>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
