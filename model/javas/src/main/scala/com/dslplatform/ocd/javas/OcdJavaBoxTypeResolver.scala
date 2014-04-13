package com.dslplatform.ocd
package javas

import types.OcdType
import boxes.OcdBox

import scala.reflect.ClassTag

trait OcdJavaBoxTypeResolver { this: OcdJavaBoxTypeValues =>
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

  def resolve[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdJavaBoxType =
    cache.getOrElse(tc.asInstanceOf[Class[OcdType]],
      sys.error(s"Type ${tc.getName} does not exist in the Java universe!")
    ).getOrElse(bc.asInstanceOf[Class[OcdBox]],
      sys.error(s"Box ${bc.getName} for type {$tc.getName} does not exist in the Java universe!")
    ).asInstanceOf[OcdJavaBoxType with T with B]

  def resolve[T <: OcdType, B <: OcdBox](implicit tct: ClassTag[T], bct: ClassTag[B]): OcdJavaBoxType =
    resolve(
      tct.runtimeClass.asInstanceOf[Class[OcdType]]
    , bct.runtimeClass.asInstanceOf[Class[OcdBox]]
    )

  def resolve[T <: OcdType, B <: OcdBox](t: T, b: B): OcdJavaBoxType =
    resolve(t.typeClass, b.boxClass)

  def resolve[TB <: OcdType with OcdBox](tb: TB): OcdJavaBoxType =
    resolve(tb, tb)
}
