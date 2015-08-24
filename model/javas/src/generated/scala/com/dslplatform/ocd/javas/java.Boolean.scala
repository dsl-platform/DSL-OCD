package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaBoolean
    extends OcdJavaBoxType
    with `type.Boolean` {

  val isPrecise = false
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Boolean`
    extends JavaBoolean with `box.One` {

  val javaClass = "boolean"
  val javaType = JavaSimpleType("boolean")
  val javaDescription = "OneBoolean"

  def defaultValue = SingleJavaValue("false")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("true")
  )

  val hasGenerics = false
}

case object `java.Boolean?`
    extends JavaBoolean with `box.Nullable` {

  val javaClass = "Boolean"
  val javaType = JavaSimpleType("Boolean")
  val javaDescription = "NullableBoolean"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("false")
  , SingleJavaValue("true")
  )

  val hasGenerics = false
}

case object `java.Boolean[]`
    extends JavaBoolean with `box.OneArrayOfOne` {

  val javaClass = "boolean[]"
  val javaType = JavaSimpleType("boolean[]")
  val javaDescription = "OneArrayOfOneBooleans"

  def defaultValue = SingleJavaValue("new boolean[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean[]?`
    extends JavaBoolean with `box.NullableArrayOfOne` {

  val javaClass = "boolean[]"
  val javaType = JavaSimpleType("boolean[]")
  val javaDescription = "NullableArrayOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean?[]`
    extends JavaBoolean with `box.OneArrayOfNullable` {

  val javaClass = "Boolean[]"
  val javaType = JavaSimpleType("Boolean[]")
  val javaDescription = "OneArrayOfNullableBooleans"

  def defaultValue = SingleJavaValue("new Boolean[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.Boolean?[]?`
    extends JavaBoolean with `box.NullableArrayOfNullable` {

  val javaClass = "Boolean[]"
  val javaType = JavaSimpleType("Boolean[]")
  val javaDescription = "NullableArrayOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ArrayOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = false
}

case object `java.List<Boolean>`
    extends JavaBoolean with `box.OneListOfOne` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "OneListOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean>?`
    extends JavaBoolean with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "NullableListOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean?>`
    extends JavaBoolean with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "OneListOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.List<Boolean?>?`
    extends JavaBoolean with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Boolean>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Boolean"))
  val javaDescription = "NullableListOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , ListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean>`
    extends JavaBoolean with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "OneSetOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean>?`
    extends JavaBoolean with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "NullableSetOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean?>`
    extends JavaBoolean with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "OneSetOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Boolean?>?`
    extends JavaBoolean with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Boolean"))
  val javaDescription = "NullableSetOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , SetOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Boolean>`
    extends JavaBoolean with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<Boolean>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Boolean"))
  val javaDescription = "OneQueueOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Boolean>?`
    extends JavaBoolean with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<Boolean>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Boolean"))
  val javaDescription = "NullableQueueOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Boolean?>`
    extends JavaBoolean with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<Boolean>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Boolean"))
  val javaDescription = "OneQueueOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Boolean?>?`
    extends JavaBoolean with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<Boolean>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Boolean"))
  val javaDescription = "NullableQueueOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , QueueOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Boolean>`
    extends JavaBoolean with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Boolean>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Boolean"))
  val javaDescription = "OneLinkedListOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Boolean>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Boolean>?`
    extends JavaBoolean with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Boolean>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Boolean"))
  val javaDescription = "NullableLinkedListOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Boolean?>`
    extends JavaBoolean with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Boolean>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Boolean"))
  val javaDescription = "OneLinkedListOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Boolean>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Boolean?>?`
    extends JavaBoolean with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Boolean>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Boolean"))
  val javaDescription = "NullableLinkedListOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , LinkedListOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Boolean>`
    extends JavaBoolean with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<Boolean>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Boolean"))
  val javaDescription = "OneStackOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.Stack<Boolean>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Boolean>?`
    extends JavaBoolean with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<Boolean>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Boolean"))
  val javaDescription = "NullableStackOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Boolean?>`
    extends JavaBoolean with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<Boolean>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Boolean"))
  val javaDescription = "OneStackOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.Stack<Boolean>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Boolean?>?`
    extends JavaBoolean with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<Boolean>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Boolean"))
  val javaDescription = "NullableStackOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , StackOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Boolean>`
    extends JavaBoolean with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<Boolean>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Boolean"))
  val javaDescription = "OneVectorOfOneBooleans"

  def defaultValue = SingleJavaValue("new java.util.Vector<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Boolean>?`
    extends JavaBoolean with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<Boolean>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Boolean"))
  val javaDescription = "NullableVectorOfOneBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Boolean?>`
    extends JavaBoolean with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<Boolean>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Boolean"))
  val javaDescription = "OneVectorOfNullableBooleans"

  def defaultValue = SingleJavaValue("new java.util.Vector<Boolean>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Boolean?>?`
    extends JavaBoolean with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<Boolean>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Boolean"))
  val javaDescription = "NullableVectorOfNullableBooleans"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Boolean",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  , VectorOfJavaValues("Boolean",
      SingleJavaValue("null")
    , SingleJavaValue("false")
    , SingleJavaValue("true")
    )
  )

  val hasGenerics = true
}
