package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaTimestamp
    extends JavaStub {

  val classReference = "org.joda.time.DateTime"

  val defaultSingle: TestValue = "org.joda.time.DateTime.now()" ~ Unstable

  private[this] val UTC = """org.joda.time.DateTimeZone.UTC"""
  private[this] val GMT = """org.joda.time.DateTimeZone.forID("GMT")"""
  private[this] val CET = """org.joda.time.DateTimeZone.forID("CET")"""
  private[this] val EST = """org.joda.time.DateTimeZone.forID("EST")"""

  val nonDefaultValues: Seq[TestValue] = Seq(
    s"new org.joda.time.DateTime(0, ${GMT})"                                        // Epoch 1970
  , s"new org.joda.time.DateTime(1, 1, 1, 0, 0, ${UTC})"                            // 0001-01-01T00:00:00Z default value for DateTime deserialization on .NET
  , s"new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L, ${EST})"                // beyond UNIX epoch (>2038)
  , s"new org.joda.time.DateTime(2000, 3, 26, 1, 59, 59, ${CET})"                   // before DST
  , s"new org.joda.time.DateTime(2000, 3, 26, 3, 0, 0, ${CET})"                     // DST start
  , s"new org.joda.time.DateTime(2000, 10, 29, 0, 59, 59, ${UTC}).withZone(${CET})" // during DST
  , s"new org.joda.time.DateTime(2000, 10, 29, 1, 0, 0, ${UTC}).withZone(${CET})"   // DST stop
  )
}
