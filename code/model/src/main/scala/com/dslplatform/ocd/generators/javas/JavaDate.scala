package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaDate
    extends JavaStub {

  val classReference = "org.joda.time.LocalDate"

  val defaultSingle: TestValue = "org.joda.time.LocalDate.now()" ~ Unstable

/*
 * new org.joda.time.LocalDate(-1, 1, 1)
 * Can't deserialize AggregateWithSurrogatePrimaryKeyAndOneProperty.OneDate. Error: Could not convert string to DateTime: -0001-01-01. Path 'oneDate', line 1, position 31.
 *
 * new org.joda.time.LocalDate(0, 1, 2)
 * Can't deserialize AggregateWithSurrogatePrimaryKeyAndOneProperty.OneDate. Error: Could not convert string to DateTime: 0000-01-02. Path 'oneDate', line 1, position 30.
 *
 * new org.joda.time.LocalDate(1, 1, 1)
 * OneDate mismatch: expected was "0001-01-01", but actual was "2014-04-01
 *
 * new org.joda.time.LocalDate(20000, 1, 1)
 * Can't deserialize AggregateWithSurrogatePrimaryKeyAndOneProperty.OneDate. Error: Could not convert string to DateTime: 20000-01-01. Path 'oneDate', line 1, position 31.
 */

  val nonDefaultValues: Seq[TestValue] = Seq(
    "new org.joda.time.LocalDate(1, 2, 3)"                   // 0001-02-03
//  , "new org.joda.time.LocalDate(-1, 1, 1)"                  // -0001-01-01
//  , "new org.joda.time.LocalDate(0, 1, 2)"                   // 0001-01-02
  , "new org.joda.time.LocalDate(1, 1, 1)"                   // 0001-01-01 FIXME - default value for DateTime deserialization on .NET
  , "new org.joda.time.LocalDate(0)"                         // 1970
//  , "new org.joda.time.LocalDate(20000, 1, 1)"               // 20000-01-01
  , "new org.joda.time.LocalDate(Integer.MAX_VALUE * 1001L)" // beyond UNIX epoch (>2038)
  , "new org.joda.time.LocalDate(9999, 12, 31)"                // 9999-12-31
  )
}
