package com.dslplatform.ocd
package test
package javatest
package property

import kinds._
import javas._
import boxes._

trait OcdJavaProperty {
  def name: String
  def box: OcdBox
  def javaType: JavaType
  def kind: OcdKind
}

object OcdJavaProperty {
  def apply(
      _name: String
    , _box: OcdBox
    , _javaType: JavaType
    , _kind: OcdKind): OcdJavaProperty =
    new OcdJavaProperty {
      def name = _name
      def box = _box
      def javaType = _javaType
      def kind = _kind
    }
}

trait OcdJavaBoxTypeProperty
    extends OcdJavaProperty {
  def boxType: OcdJavaBoxType
  def box = boxType
  def javaType = boxType.javaType
  def kind = boxType
}

object OcdJavaBoxTypeProperty {
  def apply(
      _name: String
    , _boxType: OcdJavaBoxType): OcdJavaBoxTypeProperty =
    new OcdJavaBoxTypeProperty {
      def name = _name
      def boxType = _boxType
    }
}

trait OcdJavaDom
    extends OcdKind {
  def properties: IndexedSeq[OcdJavaProperty]
}

object OcdJavaDom {
  def apply(
    _properties: OcdJavaProperty*): OcdJavaDom =
    new OcdJavaDom {
      def properties = _properties.toIndexedSeq
    }
}

trait OcdJavaDomProperty
    extends OcdJavaDom
    with OcdJavaProperty

object OcdJavaDomProperty {
  def apply(
      _name: String
    , _box: OcdBox
    , _javaType: JavaType
    , _kind: OcdKind
    , _properties: OcdJavaProperty*): OcdJavaDomProperty =
    new OcdJavaDomProperty {
      def name = _name
      def box = _box
      def javaType = _javaType
      def kind = _kind
      def properties = _properties.toIndexedSeq
    }
}
