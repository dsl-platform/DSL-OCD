package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaIp
    extends JavaStub {
  val classReference = "java.net.InetAddress"

/*
 * When sending <null> (default IP), not an error, but needs better error message
 * Unexpected return code: 400, response: Error saving: Error getting value from 'ScopeId' on 'System.Net.IPAddress'.
 *
 * com.dslplatform.ocd.test.TypeFactory.buildIP("127.0.0.1")
 * Unexpected return code: 400, response: "Can't deserialize AggregateWithSurrogatePrimaryKeyAndOneProperty.OneIp. Error: Error converting value \"127.0.0.1\" to type 'System.Net.IPAddress'. Path 'oneIp', line 1, position 27.
 */

  val defaultSingle = DisallowedNullValue

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"127.0.0.1"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"0"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"255.255.255.255"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"::1"})"
  , E"com.dslplatform.ocd.test.TypeFactory.buildIP(${"ffff::ffff"})"
  )
}
