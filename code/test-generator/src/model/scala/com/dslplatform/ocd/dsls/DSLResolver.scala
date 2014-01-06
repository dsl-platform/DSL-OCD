package com.dslplatform.ocd
package dsls

import types.OcdType
import boxes.OcdBox
import scala.reflect.ClassTag

object DSLResolver {
  private val cache =
    (OcdType.values flatMap { t =>
      val tc = t.typeClass
      OcdBox.values flatMap { b =>
        val bc = b.boxClass
        OcdDsl.values filter { d =>
          (tc eq d.typeClass) &&
          (bc eq d.boxClass)
        } map {
          (tc.asInstanceOf[Class[OcdType]] ->
          bc.asInstanceOf[Class[OcdBox]]) ->
        }
      }
    }) groupBy(_._1) mapValues(_ .map(_._2))

  def resolveAll[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): IndexedSeq[OcdDsl with T with B] =
    resolveAll(
      tc.runtimeClass.asInstanceOf[Class[T]]
    , bc.runtimeClass.asInstanceOf[Class[B]])

  def resolveAll[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): IndexedSeq[OcdDsl with T with B] =
    cache((
      tc.asInstanceOf[Class[OcdType]]
    , bc.asInstanceOf[Class[OcdBox]]
    )).asInstanceOf[IndexedSeq[OcdDsl with T with B]]

  def resolveAll[T <: OcdType, B <: OcdBox](t: T, b: B): IndexedSeq[OcdDsl with T with B] =
    resolveAll(t.getClass, b.getClass)

  def resolveOne[T <: OcdType, B <: OcdBox](tc: Class[T], bc: Class[B]): OcdDsl with T with B =
    resolveAll(tc, bc).head

  def resolveOne[T <: OcdType, B <: OcdBox](t: T, b: B): OcdDsl with T with B =
    resolveAll(t, b).head

  def resolveOne[T <: OcdType, B <: OcdBox](implicit tc: ClassTag[T], bc: ClassTag[B]): OcdDsl with T with B =
    resolveAll(tc, bc).head
}
