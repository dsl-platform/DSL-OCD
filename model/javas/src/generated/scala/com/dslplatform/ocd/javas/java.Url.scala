package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaUrl
    extends OcdJavaBoxType
    with `type.Url` {

  val isPrecise = false
  val isPrimitive = false
}

case object `java.Url`
    extends JavaUrl with `box.One` {

  val javaClass = "java.net.URI"
  val javaType = JavaSimpleType("java.net.URI")
  val javaDescription = "OneUrl"

  def defaultValue = DisallowedNullValue

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
  )

  val hasGenerics = false
}

case object `java.Url?`
    extends JavaUrl with `box.Nullable` {

  val javaClass = "java.net.URI"
  val javaType = JavaSimpleType("java.net.URI")
  val javaDescription = "NullableUrl"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
  , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
  )

  val hasGenerics = false
}

case object `java.Url[]`
    extends JavaUrl with `box.OneArrayOfOne` {

  val javaClass = "java.net.URI[]"
  val javaType = JavaSimpleType("java.net.URI[]")
  val javaDescription = "OneArrayOfOneUrls"

  def defaultValue = SingleJavaValue("new java.net.URI[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = false
}

case object `java.Url[]?`
    extends JavaUrl with `box.NullableArrayOfOne` {

  val javaClass = "java.net.URI[]"
  val javaType = JavaSimpleType("java.net.URI[]")
  val javaDescription = "NullableArrayOfOneUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = false
}

case object `java.Url?[]`
    extends JavaUrl with `box.OneArrayOfNullable` {

  val javaClass = "java.net.URI[]"
  val javaType = JavaSimpleType("java.net.URI[]")
  val javaDescription = "OneArrayOfNullableUrls"

  def defaultValue = SingleJavaValue("new java.net.URI[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = false
}

case object `java.Url?[]?`
    extends JavaUrl with `box.NullableArrayOfNullable` {

  val javaClass = "java.net.URI[]"
  val javaType = JavaSimpleType("java.net.URI[]")
  val javaDescription = "NullableArrayOfNullableUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ArrayOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Url>`
    extends JavaUrl with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.net.URI>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.URI"))
  val javaDescription = "OneListOfOneUrls"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.net.URI>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Url>?`
    extends JavaUrl with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.net.URI>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.URI"))
  val javaDescription = "NullableListOfOneUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Url?>`
    extends JavaUrl with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.net.URI>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.URI"))
  val javaDescription = "OneListOfNullableUrls"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.net.URI>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Url?>?`
    extends JavaUrl with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.net.URI>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.net.URI"))
  val javaDescription = "NullableListOfNullableUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , ListOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Url>`
    extends JavaUrl with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.net.URI>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.URI"))
  val javaDescription = "OneSetOfOneUrls"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.net.URI>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Url>?`
    extends JavaUrl with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.net.URI>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.URI"))
  val javaDescription = "NullableSetOfOneUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Url?>`
    extends JavaUrl with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.net.URI>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.URI"))
  val javaDescription = "OneSetOfNullableUrls"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.net.URI>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Url?>?`
    extends JavaUrl with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.net.URI>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.net.URI"))
  val javaDescription = "NullableSetOfNullableUrls"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  , SetOfJavaValues("java.net.URI",
      SingleJavaValue("null")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://127.0.0.1/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"http://www.xyz.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://www.abc.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"ftp://www.pqr.com/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"https://localhost:8080/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"mailto:snail@mail.hu\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"file:///~/opt/somefile.md\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"tcp://localhost:8181/\")")
    , SingleJavaValue("com.dslplatform.ocd.test.TypeFactory.buildURI(\"failover:(tcp://localhost:8181,tcp://localhost:8080/)\")")
    )
  )

  val hasGenerics = true
}
