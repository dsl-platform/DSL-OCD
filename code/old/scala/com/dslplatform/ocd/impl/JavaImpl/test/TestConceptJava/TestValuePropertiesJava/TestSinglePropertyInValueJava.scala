package com.dslplatform.ocd
package impl
package java
package test

import dsl.test._
import types._

trait TestSinglePropertyInValueJava
    extends TestValuePropertiesJava
    with TestSinglePropertyInValueDsl {

  val packageTest = ".one";
}
