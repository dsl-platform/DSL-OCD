package com.dslplatform.ocd
package test
package TestJava
package value

import org.apache.commons.codec.digest.DigestUtils.sha1

trait TestJavaHashCodeStability
    extends TestComponentJava
    with types.TestHashCodeStabilityType {

  val testDesc = "Test hashCode stability"

  val imports = Seq(
    "static org.junit.Assert.*"
  )

  def moduleName: String
  def javaClass: String

  def fullName = moduleName + "." + javaClass

//  def defaultSeed = {
//    val seedBytes = sha1(fullName)
//
//    val seed =
//      ((seedBytes(0) & 0xff) << 24) |
//      ((seedBytes(1) & 0xff) << 16) |
//      ((seedBytes(2) & 0xff) <<  8) |
//      ((seedBytes(3) & 0xff)      )
//
//    val result = 31 + seed
//    "0x%X" format result
//  }

  def defaultSeed = {
    fullName match {
      case "ZeroPropertiesInValue.ZeroPropertiesValue" => 1228214578
      case _ => sys.error("Need to Sync with .NET!")
    }
  }

  def defaultHashCode = {
    val result = 31 + defaultSeed
    "0x%X" format result
  }


  // TODO:
  // Sync with .NET to ensure consistent hashCodes
  // Currently it's platform dependent.

  def testComponentBody =
    s"""
    /* Value objects of arity-0 should have a static hashCode */
    @Test
    public void testHashCodeStability() {
      assertEquals(
              new ${javaClass}().hashCode(),
              ${defaultHashCode});
    }
"""
}
