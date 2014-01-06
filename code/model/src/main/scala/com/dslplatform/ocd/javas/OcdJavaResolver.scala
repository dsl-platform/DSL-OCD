package com.dslplatform.ocd
package javas

import types.OcdType
import boxes.OcdBox

import scala.reflect.ClassTag

trait OcdJavaResolver { this: OcdJava.type =>
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

  def resolve[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdJava with T with B =
    cache.getOrElse(tc.asInstanceOf[Class[OcdType]],
      sys.error(s"Type ${tc.getName} does not exist in the Java universe!")
    ).getOrElse(bc.asInstanceOf[Class[OcdBox]],
      sys.error(s"Box ${bc.getName} for type {$tc.getName} does not exist in the Java universe!")
    ).asInstanceOf[OcdJava with T with B]

  def resolve[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): OcdJava with T with B =
    resolve(
      tc.runtimeClass.asInstanceOf[Class[T]]
    , bc.runtimeClass.asInstanceOf[Class[B]]
    )

  def resolve[T <: OcdType, B <: OcdBox](t: T, b: B): OcdJava with T with B =
    resolve(t.typeClass, b.boxClass).asInstanceOf[OcdJava with T with B]
}
