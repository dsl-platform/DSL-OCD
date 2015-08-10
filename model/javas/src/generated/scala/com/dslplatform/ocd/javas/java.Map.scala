package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaMap
    extends OcdJavaBoxType
    with `type.Map` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Map`
    extends JavaMap with `box.One` {

  val javaClass = "java.util.Map<String, String>"
  val javaType = JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String"))
  val javaDescription = "OneMap"

  def defaultValue = SingleJavaValue("new java.util.HashMap<String, String>(0)")

  def nonDefaultValues = IndexedSeq(
    MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
  , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
  , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
  )

  val hasGenerics = true
}

case object `java.Map?`
    extends JavaMap with `box.Nullable` {

  val javaClass = "java.util.Map<String, String>"
  val javaType = JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String"))
  val javaDescription = "NullableMap"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new java.util.HashMap<String, String>(0)")
  , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
  , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
  , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
  )

  val hasGenerics = true
}

case object `java.Map[]`
    extends JavaMap with `box.OneArrayOfOne` {

  val javaClass = "java.util.Map<String, String>[]"
  val javaType = JavaSimpleType("java.util.Map[]")
  val javaDescription = "OneArrayOfOneMaps"

  def defaultValue = SingleJavaValue("new java.util.Map[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ArrayOfJavaValues("java.util.Map",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Map[]?`
    extends JavaMap with `box.NullableArrayOfOne` {

  val javaClass = "java.util.Map<String, String>[]"
  val javaType = JavaSimpleType("java.util.Map[]")
  val javaDescription = "NullableArrayOfOneMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ArrayOfJavaValues("java.util.Map",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Map?[]`
    extends JavaMap with `box.OneArrayOfNullable` {

  val javaClass = "java.util.Map<String, String>[]"
  val javaType = JavaSimpleType("java.util.Map[]")
  val javaDescription = "OneArrayOfNullableMaps"

  def defaultValue = SingleJavaValue("new java.util.Map[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ArrayOfJavaValues("java.util.Map",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Map?[]?`
    extends JavaMap with `box.NullableArrayOfNullable` {

  val javaClass = "java.util.Map<String, String>[]"
  val javaType = JavaSimpleType("java.util.Map[]")
  val javaDescription = "NullableArrayOfNullableMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ArrayOfJavaValues("java.util.Map",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ArrayOfJavaValues("java.util.Map",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.List<Map>`
    extends JavaMap with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.List", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneListOfOneMaps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.List<Map>?`
    extends JavaMap with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.List", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableListOfOneMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.List<Map?>`
    extends JavaMap with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.List", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneListOfNullableMaps"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.List<Map?>?`
    extends JavaMap with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.List", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableListOfNullableMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , ListOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Map>`
    extends JavaMap with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Queue", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneQueueOfOneMaps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Map>?`
    extends JavaMap with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Queue", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableQueueOfOneMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Map?>`
    extends JavaMap with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Queue", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneQueueOfNullableMaps"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Map?>?`
    extends JavaMap with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Queue", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableQueueOfNullableMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , QueueOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Map>`
    extends JavaMap with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Set", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneSetOfOneMaps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Map>?`
    extends JavaMap with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Set", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableSetOfOneMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Map?>`
    extends JavaMap with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Set", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "OneSetOfNullableMaps"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.Map<String, String>>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Map?>?`
    extends JavaMap with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.util.Map<String, String>>"
  val javaType = JavaCollectionType("java.util.Set", JavaGenericType("java.util.Map", JavaClass("String"), JavaClass("String")))
  val javaDescription = "NullableSetOfNullableMaps"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  , SetOfJavaValues("java.util.Map<String, String>",
      SingleJavaValue("null")
    , SingleJavaValue("new java.util.HashMap<String, String>(0)")
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"a\"") -> SingleJavaValue("\"b\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"Quote: \\\", Solidus /\"") -> SingleJavaValue("\"Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
      )
    , MapOfJavaValues("String", "String",
        SingleJavaValue("\"\"") -> SingleJavaValue("\"empty\"")
      , SingleJavaValue("\"a\"") -> SingleJavaValue("\"1\"")
      , SingleJavaValue("\"b\"") -> SingleJavaValue("\"2\"")
      , SingleJavaValue("\"c\"") -> SingleJavaValue("\"3\"")
      )
    )
  )

  val hasGenerics = true
}
