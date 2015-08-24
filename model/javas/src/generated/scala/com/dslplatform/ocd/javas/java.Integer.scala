package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaInteger
    extends OcdJavaBoxType
    with `type.Integer` {

  val isPrecise = false
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Integer`
    extends JavaInteger with `box.One` {

  val javaClass = "int"
  val javaType = JavaSimpleType("int")
  val javaDescription = "OneInteger"

  def defaultValue = SingleJavaValue("0")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("Integer.MIN_VALUE")
  , SingleJavaValue("Integer.MAX_VALUE")
  , SingleJavaValue("-1000000000")
  , SingleJavaValue("1000000000")
  )

  val hasGenerics = false
}

case object `java.Integer?`
    extends JavaInteger with `box.Nullable` {

  val javaClass = "Integer"
  val javaType = JavaSimpleType("Integer")
  val javaDescription = "NullableInteger"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("0")
  , SingleJavaValue("Integer.MIN_VALUE")
  , SingleJavaValue("Integer.MAX_VALUE")
  , SingleJavaValue("-1000000000")
  , SingleJavaValue("1000000000")
  )

  val hasGenerics = false
}

case object `java.Integer[]`
    extends JavaInteger with `box.OneArrayOfOne` {

  val javaClass = "int[]"
  val javaType = JavaSimpleType("int[]")
  val javaDescription = "OneArrayOfOneIntegers"

  def defaultValue = SingleJavaValue("new int[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("int",
      SingleJavaValue("0")
    )
  , ArrayOfJavaValues("int",
      SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("int",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = false
}

case object `java.Integer[]?`
    extends JavaInteger with `box.NullableArrayOfOne` {

  val javaClass = "int[]"
  val javaType = JavaSimpleType("int[]")
  val javaDescription = "NullableArrayOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("int",
      SingleJavaValue("0")
    )
  , ArrayOfJavaValues("int",
      SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("int",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = false
}

case object `java.Integer?[]`
    extends JavaInteger with `box.OneArrayOfNullable` {

  val javaClass = "Integer[]"
  val javaType = JavaSimpleType("Integer[]")
  val javaDescription = "OneArrayOfNullableIntegers"

  def defaultValue = SingleJavaValue("new Integer[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = false
}

case object `java.Integer?[]?`
    extends JavaInteger with `box.NullableArrayOfNullable` {

  val javaClass = "Integer[]"
  val javaType = JavaSimpleType("Integer[]")
  val javaDescription = "NullableArrayOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , ArrayOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = false
}

case object `java.List<Integer>`
    extends JavaInteger with `box.OneListOfOne` {

  val javaClass = "java.util.List<Integer>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Integer"))
  val javaDescription = "OneListOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.List<Integer>?`
    extends JavaInteger with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Integer>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Integer"))
  val javaDescription = "NullableListOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.List<Integer?>`
    extends JavaInteger with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Integer>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Integer"))
  val javaDescription = "OneListOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.List<Integer?>?`
    extends JavaInteger with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Integer>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Integer"))
  val javaDescription = "NullableListOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , ListOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Integer>`
    extends JavaInteger with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Integer>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Integer"))
  val javaDescription = "OneSetOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Integer>?`
    extends JavaInteger with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Integer>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Integer"))
  val javaDescription = "NullableSetOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Integer?>`
    extends JavaInteger with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Integer>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Integer"))
  val javaDescription = "OneSetOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Integer?>?`
    extends JavaInteger with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Integer>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Integer"))
  val javaDescription = "NullableSetOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , SetOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Integer>`
    extends JavaInteger with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<Integer>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Integer"))
  val javaDescription = "OneQueueOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Integer>?`
    extends JavaInteger with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<Integer>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Integer"))
  val javaDescription = "NullableQueueOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Integer?>`
    extends JavaInteger with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<Integer>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Integer"))
  val javaDescription = "OneQueueOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Integer?>?`
    extends JavaInteger with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<Integer>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Integer"))
  val javaDescription = "NullableQueueOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , QueueOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Integer>`
    extends JavaInteger with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Integer>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Integer"))
  val javaDescription = "OneLinkedListOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Integer>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Integer>?`
    extends JavaInteger with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Integer>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Integer"))
  val javaDescription = "NullableLinkedListOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Integer?>`
    extends JavaInteger with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Integer>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Integer"))
  val javaDescription = "OneLinkedListOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Integer>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Integer?>?`
    extends JavaInteger with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Integer>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Integer"))
  val javaDescription = "NullableLinkedListOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , LinkedListOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Integer>`
    extends JavaInteger with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<Integer>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Integer"))
  val javaDescription = "OneStackOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.Stack<Integer>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Integer>?`
    extends JavaInteger with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<Integer>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Integer"))
  val javaDescription = "NullableStackOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Integer?>`
    extends JavaInteger with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<Integer>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Integer"))
  val javaDescription = "OneStackOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.Stack<Integer>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Integer?>?`
    extends JavaInteger with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<Integer>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Integer"))
  val javaDescription = "NullableStackOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , StackOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Integer>`
    extends JavaInteger with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<Integer>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Integer"))
  val javaDescription = "OneVectorOfOneIntegers"

  def defaultValue = SingleJavaValue("new java.util.Vector<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Integer>?`
    extends JavaInteger with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<Integer>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Integer"))
  val javaDescription = "NullableVectorOfOneIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Integer?>`
    extends JavaInteger with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<Integer>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Integer"))
  val javaDescription = "OneVectorOfNullableIntegers"

  def defaultValue = SingleJavaValue("new java.util.Vector<Integer>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Integer?>?`
    extends JavaInteger with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<Integer>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Integer"))
  val javaDescription = "NullableVectorOfNullableIntegers"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Integer",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  , VectorOfJavaValues("Integer",
      SingleJavaValue("null")
    , SingleJavaValue("0")
    , SingleJavaValue("Integer.MIN_VALUE")
    , SingleJavaValue("Integer.MAX_VALUE")
    , SingleJavaValue("-1000000000")
    , SingleJavaValue("1000000000")
    )
  )

  val hasGenerics = true
}
