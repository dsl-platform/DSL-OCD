package com.dslplatform.ocd
package boxes

sealed trait CollectionType {
  def aliases = Seq.empty[String]
}

object CollectionType {
  case object Array extends CollectionType {
    override def aliases = Seq("Brackets")
  }
  case object List extends CollectionType
  case object Set extends CollectionType

  val values: IndexedSeq[CollectionType] = IndexedSeq(
    Array
  , List
  , Set
  )
}
