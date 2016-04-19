package com.dslplatform.ocd
package test
package javatest
package property

import types._
import javas._

trait TestComponentWithProperty
    extends TestComponent {

  def conceptName: String
  def property: OcdJavaProperty

  protected def testSuffix = ""

  protected def propertyName = property.name
  protected def PropertyName = property.name.fciu

  def isDisallowed(isDefault: Boolean) =
    property match {
      case p: OcdJavaBoxTypeProperty =>
        isDefault && (p.boxType.defaultValue eq DisallowedNullValue)

      case _ =>
        false
    }

  protected def propertyType = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType
    case _ => sys.error("Could not get propertyType of: " + property)
  }

  protected def defaultValue = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.defaultValue
    case _ => "null"
  }

  protected def javaClass = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.javaClass
    case _ => property.javaType.toString
  }

  protected def hasGenerics = property match {
    case p: OcdJavaBoxTypeProperty => p.boxType.hasGenerics
    case _ => javaClass.contains('<')
  }
}
