package com.dslplatform.ocd

package boxes {
  trait OcdBox {
    def boxName: String

    def boxAliases: Set[String]
  }

  object OcdBox {
    val values: IndexedSeq[OcdBox] = IndexedSeq(
      `box.One`
    , `box.OneArrayOfOne`
    , `box.OneArrayOfNullable`
    , `box.OneListOfOne`
    , `box.OneListOfNullable`
    , `box.OneSetOfOne`
    , `box.OneSetOfNullable`
    , `box.Nullable`
    , `box.NullableArrayOfOne`
    , `box.NullableArrayOfNullable`
    , `box.NullableListOfOne`
    , `box.NullableListOfNullable`
    , `box.NullableSetOfOne`
    , `box.NullableSetOfNullable`
    )
  }
}

package object boxes {
  type `box.OneBracketsOfOne` = `box.OneArrayOfOne`
  val  `box.OneBracketsOfOne` = `box.OneArrayOfOne`

  type `box.OneBracketsOfNullable` = `box.OneArrayOfNullable`
  val  `box.OneBracketsOfNullable` = `box.OneArrayOfNullable`

  type `box.NullableBracketsOfOne` = `box.NullableArrayOfOne`
  val  `box.NullableBracketsOfOne` = `box.NullableArrayOfOne`

  type `box.NullableBracketsOfNullable` = `box.NullableArrayOfNullable`
  val  `box.NullableBracketsOfNullable` = `box.NullableArrayOfNullable`
}
