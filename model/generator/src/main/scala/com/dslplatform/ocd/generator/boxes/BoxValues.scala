package com.dslplatform.ocd
package generator
package boxes

case class Box(
  base: SingleFamily
, collectionFamily: Option[(CollectionFamily, SingleFamily)]
, aliases: String*) {

  val name = base +
    collectionFamily.map(c => c._1 + "Of" + c._2).getOrElse("")
}

trait BoxValues {
  private def boxOrder(box: Box) = (
    box.collectionFamily.map(_._1.toString.head)
  , box.collectionFamily.map(-_._2.toString.head)
  )

  val boxValues =
    SingleFamily.values.flatMap( s =>
      Box(s, None) +:
      CollectionFamily.values.flatMap( c =>
        SingleFamily.values.map( e =>
          Box(s, Some((c, e)), c.aliases.map(a =>
            s + a + "Of" + e
          ): _*)
        )
      )
    ).sortBy(boxOrder)
}
