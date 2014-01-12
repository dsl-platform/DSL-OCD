package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaDate
    extends OcdJava
    with `type.Date`

case object `java.Date`
    extends JavaDate with `box.One` {

  val javaClass = "org.joda.time.LocalDate"

  val defaultValue = "org.joda.time.LocalDate.now()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Date[]`
    extends JavaDate with `box.OneArrayOfOne` {

  val javaClass = "org.joda.time.LocalDate[]"

  val defaultValue = "new org.joda.time.LocalDate[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Date?[]`
    extends JavaDate with `box.OneArrayOfNullable` {

  val javaClass = "org.joda.time.LocalDate[]"

  val defaultValue = "new org.joda.time.LocalDate[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Date>`
    extends JavaDate with `box.OneListOfOne` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"

  val defaultValue = "new java.util.ArrayList<org.joda.time.LocalDate>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Date?>`
    extends JavaDate with `box.OneListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"

  val defaultValue = "new java.util.ArrayList<org.joda.time.LocalDate>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Date>`
    extends JavaDate with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"

  val defaultValue = "new java.util.HashSet<org.joda.time.LocalDate>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Date?>`
    extends JavaDate with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"

  val defaultValue = "new java.util.HashSet<org.joda.time.LocalDate>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Date?`
    extends JavaDate with `box.Nullable` {

  val javaClass = "org.joda.time.LocalDate"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Date[]?`
    extends JavaDate with `box.NullableArrayOfOne` {

  val javaClass = "org.joda.time.LocalDate[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Date?[]?`
    extends JavaDate with `box.NullableArrayOfNullable` {

  val javaClass = "org.joda.time.LocalDate[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Date>?`
    extends JavaDate with `box.NullableListOfOne` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Date?>?`
    extends JavaDate with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<org.joda.time.LocalDate>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Date>?`
    extends JavaDate with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Date?>?`
    extends JavaDate with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<org.joda.time.LocalDate>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
