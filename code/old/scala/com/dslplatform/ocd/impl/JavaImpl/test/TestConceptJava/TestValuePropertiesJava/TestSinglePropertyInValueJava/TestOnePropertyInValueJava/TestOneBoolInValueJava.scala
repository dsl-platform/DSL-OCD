package com.dslplatform.ocd
package impl
package java
package test

import dsl.test._
import types._

trait TestOneBoolInValueJava
    extends TestOnePropertyInValueJava
    with TestOneBoolInValueDsl
    with TestFieldTypeJava
    with TestGetterTypeJava {

  override def propertyType = `java.Boolean`

  override def javaTemplate =
    super.javaTemplate
}
