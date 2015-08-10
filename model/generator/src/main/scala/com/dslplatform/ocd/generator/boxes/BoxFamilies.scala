package com.dslplatform.ocd
package generator
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
  case object Queue extends CollectionFamily("Q")
//  case object Stack extends CollectionFamily("S")
//  case object Vector extends CollectionFamily("V")
//  case object LinkedList extends CollectionFamily("K")
//  case object Bag extends CollectionFamily("B")

  val values: IndexedSeq[CollectionFamily] = IndexedSeq(
    Array
  , List
  , Set
  , Queue
//  , Stack
//  , Vector
//  , LinkedList
//  , Bag
  )
}
