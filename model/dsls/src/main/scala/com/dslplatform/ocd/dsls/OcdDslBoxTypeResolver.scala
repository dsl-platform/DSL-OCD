package com.dslplatform.ocd
package dsls

import types.OcdType
import boxes.OcdBox

import scala.reflect.ClassTag

trait OcdDslBoxTypeResolver { this: OcdDslBoxTypeValues =>
  private val cache =
    (OcdType.values map { t =>
      t.typeClass.asInstanceOf[Class[OcdType]] ->
      (OcdBox.values map { b =>
        b.boxClass.asInstanceOf[Class[OcdBox]] ->
        (values filter { d =>
          (d.typeClass eq t.typeClass) &&
          (d.boxClass eq b.boxClass)
        })
      }).toMap
    }).toMap

  def resolveAll[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): IndexedSeq[OcdDslBoxType] =
    cache.getOrElse(tc.asInstanceOf[Class[OcdType]],
      sys.error(s"Type ${tc.getName} does not exist as a DSL concept!")
    ).getOrElse(bc.asInstanceOf[Class[OcdBox]],
      sys.error(s"Box ${bc.getName} for type {$tc.getName} does not exist as a DSL concept!")
    )

  def resolveAll[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): IndexedSeq[OcdDslBoxType] =
    resolveAll(
      tc.runtimeClass.asInstanceOf[Class[OcdType]]
    , bc.runtimeClass.asInstanceOf[Class[OcdBox]])

  def resolveAll[T <: OcdType, B <: OcdBox](t: T, b: B): IndexedSeq[OcdDslBoxType] =
    resolveAll(t.typeClass, b.boxClass)

  def resolveAll[TB <: OcdType with OcdBox](tb: TB): IndexedSeq[OcdDslBoxType] =
    resolveAll(tb, tb)

  def resolve[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdDslBoxType =
    resolveAll(tc, bc).head

  def resolve[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): OcdDslBoxType =
    resolveAll(tc, bc).head

  def resolve[T <: OcdType, B <: OcdBox](t: T, b: B): OcdDslBoxType =
    resolveAll(t, b).head

  def resolve[TB <: OcdType with OcdBox](tb: TB): OcdDslBoxType =
    resolveAll(tb).head
}
