package com.dslplatform.ocd
package scalas

import types.OcdType
import boxes.OcdBox

import scala.reflect.ClassTag

trait OcdScalaBoxTypeResolver { this: OcdScalaBoxTypeValues =>
  private val cache =
    (OcdType.values map { t =>
      t.typeClass.asInstanceOf[Class[OcdType]] ->
      (OcdBox.values map { b =>
        b.boxClass.asInstanceOf[Class[OcdBox]] ->
        (values find{ j =>
          (j.typeClass eq t.typeClass) &&
          (j.boxClass eq b.boxClass)
        })
      }).collect{ case (bc, Some(jo)) => (bc, jo) }.toMap
    }).toMap

  def resolve[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdScalaBoxType =
    cache.getOrElse(tc.asInstanceOf[Class[OcdType]],
      sys.error(s"Type ${tc.getName} does not exist in the Scala universe!")
    ).getOrElse(bc.asInstanceOf[Class[OcdBox]],
      sys.error(s"Box ${bc.getName} for type {$tc.getName} does not exist in the Scala universe!")
    ).asInstanceOf[OcdScalaBoxType with T with B]

  def resolve[T <: OcdType, B <: OcdBox](implicit tct: ClassTag[T], bct: ClassTag[B]): OcdScalaBoxType =
    resolve(
      tct.runtimeClass.asInstanceOf[Class[OcdType]]
    , bct.runtimeClass.asInstanceOf[Class[OcdBox]]
    )

  def resolve[T <: OcdType, B <: OcdBox](t: T, b: B): OcdScalaBoxType =
    resolve(t.typeClass, b.boxClass)

  def resolve[TB <: OcdType with OcdBox](tb: TB): OcdScalaBoxType =
    resolve(tb, tb)
}
