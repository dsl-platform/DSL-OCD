package com.dslplatform.ocd.test

import org.scalatest._
import scala.reflect.runtime.universe._

object ReflectionLock

trait OcdSpec
    extends Spec {

  def lock[T](what: => T) =
    ReflectionLock synchronized what

  def checkType(expected: => Type, actual: => Type) = {
    // Synchronization around reflection
    // should no longer be needed from 2.10.4+
    // but it's lies, damn lies
    lock {
      if (!(expected =:= actual)) {
        fail("Expected type was " + expected + ", but got " + actual)
      }
    }
  }
}
