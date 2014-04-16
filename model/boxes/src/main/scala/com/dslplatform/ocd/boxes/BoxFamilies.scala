package com.dslplatform.ocd
package boxes

sealed abstract class SingleFamily(val shortName: String)

object SingleFamily {
  case object One extends SingleFamily("1")
  case object Nullable extends SingleFamily("0")

  val values: IndexedSeq[SingleFamily] = IndexedSeq(
    One
  , Nullable
  )
}

sealed abstract class CollectionFamily(val shortName: String, val aliases: Seq[String] = Seq.empty)

object CollectionFamily {
  case object Array extends CollectionFamily("A", Seq("Brackets"))
  case object List extends CollectionFamily("L")
  case object Set extends CollectionFamily("S")

  val values: IndexedSeq[CollectionFamily] = IndexedSeq(
    Array
  , List
  , Set
  )
}