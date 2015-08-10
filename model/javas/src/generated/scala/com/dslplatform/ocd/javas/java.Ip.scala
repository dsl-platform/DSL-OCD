package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaIp
    extends OcdJavaBoxType
    with `type.Ip` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Ip`
    extends JavaIp with `box.One` {

  val javaClass = "java.net.InetAddress"
  val javaType = JavaSimpleType("java.net.InetAddress")
  val javaDescription = "OneIp"

  def defaultValue = DisallowedNullValue

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
  )

  val hasGenerics = false
}

case object `java.Ip?`
    extends JavaIp with `box.Nullable` {

  val javaClass = "java.net.InetAddress"
  val javaType = JavaSimpleType("java.net.InetAddress")
  val javaDescription = "NullableIp"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
  )

  val hasGenerics = false
}

case object `java.Ip[]`
    extends JavaIp with `box.OneArrayOfOne` {

  val javaClass = "java.net.InetAddress[]"
  val javaType = JavaSimpleType("java.net.InetAddress[]")
  val javaDescription = "OneArrayOfOneIps"

  def defaultValue = SingleJavaValue("new java.net.InetAddress[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = false
}

case object `java.Ip[]?`
    extends JavaIp with `box.NullableArrayOfOne` {

  val javaClass = "java.net.InetAddress[]"
  val javaType = JavaSimpleType("java.net.InetAddress[]")
  val javaDescription = "NullableArrayOfOneIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = false
}

case object `java.Ip?[]`
    extends JavaIp with `box.OneArrayOfNullable` {

  val javaClass = "java.net.InetAddress[]"
  val javaType = JavaSimpleType("java.net.InetAddress[]")
  val javaDescription = "OneArrayOfNullableIps"

  def defaultValue = SingleJavaValue("new java.net.InetAddress[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = false
}

case object `java.Ip?[]?`
    extends JavaIp with `box.NullableArrayOfNullable` {

  val javaClass = "java.net.InetAddress[]"
  val javaType = JavaSimpleType("java.net.InetAddress[]")
  val javaDescription = "NullableArrayOfNullableIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ArrayOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Ip>`
    extends JavaIp with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneListOfOneIps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Ip>?`
    extends JavaIp with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableListOfOneIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Ip?>`
    extends JavaIp with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneListOfNullableIps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Ip?>?`
    extends JavaIp with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableListOfNullableIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , ListOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Ip>`
    extends JavaIp with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneQueueOfOneIps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Ip>?`
    extends JavaIp with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableQueueOfOneIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Ip?>`
    extends JavaIp with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneQueueOfNullableIps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Ip?>?`
    extends JavaIp with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableQueueOfNullableIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , QueueOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Ip>`
    extends JavaIp with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneSetOfOneIps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Ip>?`
    extends JavaIp with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableSetOfOneIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Ip?>`
    extends JavaIp with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.InetAddress"))
  val javaDescription = "OneSetOfNullableIps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.net.InetAddress>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Ip?>?`
    extends JavaIp with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.net.InetAddress>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.InetAddress"))
  val javaDescription = "NullableSetOfNullableIps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  , SetOfJavaValues("java.net.InetAddress",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"127.0.0.1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"0\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"255.255.255.255\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"::1\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildIP(\"ffff::ffff\")")
    )
  )

  val hasGenerics = true
}
