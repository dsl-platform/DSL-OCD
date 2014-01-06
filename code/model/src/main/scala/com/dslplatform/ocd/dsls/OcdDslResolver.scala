package com.dslplatform.ocd
package dsls

import types.OcdType
import boxes.OcdBox

import scala.reflect.ClassTag

trait OcdDslResolver { this: OcdDsl.type =>
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

  def resolveAll[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): IndexedSeq[OcdDsl with T with B] =
    cache.getOrElse(tc.asInstanceOf[Class[OcdType]],
      sys.error(s"Type ${tc.getName} does not exist as a DSL concept!")
    ).getOrElse(bc.asInstanceOf[Class[OcdBox]],
      sys.error(s"Box ${bc.getName} for type {$tc.getName} does not exist as a DSL concept!")
    ).asInstanceOf[IndexedSeq[OcdDsl with T with B]]

  def resolveAll[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): IndexedSeq[OcdDsl with T with B] =
    resolveAll(
      tc.runtimeClass.asInstanceOf[Class[T]]
    , bc.runtimeClass.asInstanceOf[Class[B]])

  def resolveAll[T <: OcdType, B <: OcdBox](t: T, b: B): IndexedSeq[OcdDsl with T with B] =
    resolveAll(t.typeClass, b.boxClass).asInstanceOf[IndexedSeq[OcdDsl with T with B]]

  def resolve[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdDsl with T with B =
    resolveAll(tc, bc).head

  def resolve[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): OcdDsl with T with B =
    resolveAll(tc, bc).head

  def resolve[T <: OcdType, B <: OcdBox](t: T, b: B): OcdDsl with T with B =
    resolveAll(t, b).head
}
