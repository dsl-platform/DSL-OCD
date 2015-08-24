package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaBinary
    extends OcdJavaBoxType
    with `type.Binary` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Binary`
    extends JavaBinary with `box.One` {

  val javaClass = "byte[]"
  val javaType = JavaSimpleType("byte[]")
  val javaDescription = "OneBinary"

  def defaultValue = SingleJavaValue("new byte[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Binary?`
    extends JavaBinary with `box.Nullable` {

  val javaClass = "byte[]"
  val javaType = JavaSimpleType("byte[]")
  val javaDescription = "NullableBinary"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("new byte[0]")
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
  , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Binary[]`
    extends JavaBinary with `box.OneArrayOfOne` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "OneArrayOfOneBinaries"

  def defaultValue = SingleJavaValue("new byte[0][]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary[]?`
    extends JavaBinary with `box.NullableArrayOfOne` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "NullableArrayOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary?[]`
    extends JavaBinary with `box.OneArrayOfNullable` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "OneArrayOfNullableBinaries"

  def defaultValue = SingleJavaValue("new byte[0][]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.Binary?[]?`
    extends JavaBinary with `box.NullableArrayOfNullable` {

  val javaClass = "byte[][]"
  val javaType = JavaSimpleType("byte[][]")
  val javaDescription = "NullableArrayOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ArrayOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ArrayOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = false
}

case object `java.List<Binary>`
    extends JavaBinary with `box.OneListOfOne` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "OneListOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary>?`
    extends JavaBinary with `box.NullableListOfOne` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "NullableListOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary?>`
    extends JavaBinary with `box.OneListOfNullable` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "OneListOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.List<Binary?>?`
    extends JavaBinary with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<byte[]>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("byte[]"))
  val javaDescription = "NullableListOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , ListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , ListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary>`
    extends JavaBinary with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "OneSetOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.HashSet<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary>?`
    extends JavaBinary with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "NullableSetOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary?>`
    extends JavaBinary with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "OneSetOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.HashSet<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Set<Binary?>?`
    extends JavaBinary with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("byte[]"))
  val javaDescription = "NullableSetOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , SetOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , SetOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Binary>`
    extends JavaBinary with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<byte[]>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("byte[]"))
  val javaDescription = "OneQueueOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , QueueOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Binary>?`
    extends JavaBinary with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<byte[]>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("byte[]"))
  val javaDescription = "NullableQueueOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , QueueOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Binary?>`
    extends JavaBinary with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<byte[]>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("byte[]"))
  val javaDescription = "OneQueueOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , QueueOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Binary?>?`
    extends JavaBinary with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<byte[]>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("byte[]"))
  val javaDescription = "NullableQueueOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , QueueOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , QueueOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Binary>`
    extends JavaBinary with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<byte[]>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("byte[]"))
  val javaDescription = "OneLinkedListOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<byte[]>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , LinkedListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Binary>?`
    extends JavaBinary with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<byte[]>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("byte[]"))
  val javaDescription = "NullableLinkedListOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , LinkedListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Binary?>`
    extends JavaBinary with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<byte[]>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("byte[]"))
  val javaDescription = "OneLinkedListOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<byte[]>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , LinkedListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Binary?>?`
    extends JavaBinary with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<byte[]>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("byte[]"))
  val javaDescription = "NullableLinkedListOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , LinkedListOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , LinkedListOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Binary>`
    extends JavaBinary with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<byte[]>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("byte[]"))
  val javaDescription = "OneStackOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.Stack<byte[]>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , StackOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Binary>?`
    extends JavaBinary with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<byte[]>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("byte[]"))
  val javaDescription = "NullableStackOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , StackOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Binary?>`
    extends JavaBinary with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<byte[]>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("byte[]"))
  val javaDescription = "OneStackOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.Stack<byte[]>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , StackOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Binary?>?`
    extends JavaBinary with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<byte[]>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("byte[]"))
  val javaDescription = "NullableStackOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , StackOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , StackOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Binary>`
    extends JavaBinary with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<byte[]>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("byte[]"))
  val javaDescription = "OneVectorOfOneBinaries"

  def defaultValue = SingleJavaValue("new java.util.Vector<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , VectorOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Binary>?`
    extends JavaBinary with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<byte[]>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("byte[]"))
  val javaDescription = "NullableVectorOfOneBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , VectorOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Binary?>`
    extends JavaBinary with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<byte[]>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("byte[]"))
  val javaDescription = "OneVectorOfNullableBinaries"

  def defaultValue = SingleJavaValue("new java.util.Vector<byte[]>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , VectorOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Binary?>?`
    extends JavaBinary with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<byte[]>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("byte[]"))
  val javaDescription = "NullableVectorOfNullableBinaries"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("byte[]",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    )
  , VectorOfJavaValues("byte[]",
      ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  , VectorOfJavaValues("byte[]",
      SingleJavaValue("null")
    , SingleJavaValue("new byte[0]")
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    )
    , ArrayOfJavaValues("byte",
      SingleJavaValue("Byte.MIN_VALUE")
    , SingleJavaValue("0")
    , SingleJavaValue("Byte.MAX_VALUE")
    )
    )
  )

  val hasGenerics = true
}
