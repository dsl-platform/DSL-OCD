package com.dslplatform.ocd
package test
package TestScala

object TestScalaSpecExtensions {
  def body = """package org.scalatest

import scala.reflect.runtime.universe._

object ReflectionLock

trait SpecExtensions
    extends Spec {

  def checkType[T1](expected: => Type, actual: => Type) = {
    ReflectionLock synchronized {
      if (!(expected =:= actual)) {
        fail("Expected type was " + expected + ", but got " + actual)
      }
    }
  }
}
"""
}
