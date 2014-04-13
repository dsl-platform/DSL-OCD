//package com.dslplatform.ocd
//package test
//package javatest
//package domain
//
//import javas.OcdJava
//import javas.JavaValue
//
//trait TestJavaDomainDefaultValue
//    extends test.TestComponent {
//
//  def conceptName: String
//  def propertyName: String
//  def propertyType: OcdJava
//
//  private def PropertyName = propertyName.fciu
//
//  def testComponentBody = s"""
//    /* Testing the "${propertyName}" property field default value */
//    @org.junit.Test
//    public void test${PropertyName}PropertyFieldDefaultValue() {
//        ${propertyType.defaultValue match {
//          case dv if dv.stability.isStable => s"""
//        com.dslplatform.ocd.javaasserts.${propertyType.typeSingleName}Asserts.assert${propertyType.boxName}Equals(
//                ${propertyType.defaultValue},
//                new ${conceptName}().get${PropertyName}());"""
//
//          case dv if dv.isNull => s"""
//        org.junit.Assert.assertNull(new ${conceptName}().get${PropertyName}());"""
//
//          case _ => s"""
//        org.junit.Assert.assertNotNull(new ${conceptName}().get${PropertyName}());"""
//        }}
//    }
//"""
//}
