package com.dslplatform.ocd
package generator
package boxes

sealed trait SingleFamily
object SingleFamily {
  case object One extends SingleFamily
  case object Nullable extends SingleFamily

  val values: IndexedSeq[SingleFamily] = IndexedSeq(
    One
  , Nullable
  )
}

sealed trait CollectionFamily {
  def aliases = Seq.empty[String]
}
object CollectionFamily {
  case object Array extends CollectionFamily { override def aliases = Seq("Brackets") }
  case object List extends CollectionFamily
  case object Set extends CollectionFamily

  val values: IndexedSeq[CollectionFamily] = IndexedSeq(
    Array
  , List
  , Set
  )
}
