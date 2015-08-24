package com.dslplatform.ocd

package boxes {
  trait OcdBoxValues {
    val values: IndexedSeq[OcdBox] = IndexedSeq(
      `box.One`
    , `box.Nullable`
    , `box.OneArrayOfOne`
    , `box.NullableArrayOfOne`
    , `box.OneArrayOfNullable`
    , `box.NullableArrayOfNullable`
    , `box.OneListOfOne`
    , `box.NullableListOfOne`
    , `box.OneListOfNullable`
    , `box.NullableListOfNullable`
    , `box.OneSetOfOne`
    , `box.NullableSetOfOne`
    , `box.OneSetOfNullable`
    , `box.NullableSetOfNullable`
    , `box.OneQueueOfOne`
    , `box.NullableQueueOfOne`
    , `box.OneQueueOfNullable`
    , `box.NullableQueueOfNullable`
    , `box.OneLinkedListOfOne`
    , `box.NullableLinkedListOfOne`
    , `box.OneLinkedListOfNullable`
    , `box.NullableLinkedListOfNullable`
    , `box.OneStackOfOne`
    , `box.NullableStackOfOne`
    , `box.OneStackOfNullable`
    , `box.NullableStackOfNullable`
    , `box.OneVectorOfOne`
    , `box.NullableVectorOfOne`
    , `box.OneVectorOfNullable`
    , `box.NullableVectorOfNullable`
    )
  }
}

package object boxes {
  type `box.OneBracketsOfOne` = `box.OneArrayOfOne`
  val  `box.OneBracketsOfOne` = `box.OneArrayOfOne`

  type `box.NullableBracketsOfOne` = `box.NullableArrayOfOne`
  val  `box.NullableBracketsOfOne` = `box.NullableArrayOfOne`

  type `box.OneBracketsOfNullable` = `box.OneArrayOfNullable`
  val  `box.OneBracketsOfNullable` = `box.OneArrayOfNullable`

  type `box.NullableBracketsOfNullable` = `box.NullableArrayOfNullable`
  val  `box.NullableBracketsOfNullable` = `box.NullableArrayOfNullable`
}
