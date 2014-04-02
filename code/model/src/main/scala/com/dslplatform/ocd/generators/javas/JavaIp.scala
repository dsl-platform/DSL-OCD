package com.dslplatform.ocd.generators
package javas

import   java.net.InetAddress


import Types._
import Boxes._

object JavaIp
    extends JavaStub {
  val classReference = "java.net.InetAddress"

/*
 * When sending <null> (default IP), not an error, but needs better error message
 * Unexpected return code: 400, response: Error saving: Error getting value from 'ScopeId' on 'System.Net.IPAddress'.
 *
 * com.dslplatform.client.TypeFactory.buildIP("127.0.0.1")
 * Unexpected return code: 400, response: "Can't deserialize AggregateWithSurrogatePrimaryKeyAndOneProperty.OneIp. Error: Error converting value \"127.0.0.1\" to type 'System.Net.IPAddress'. Path 'oneIp', line 1, position 27.
 */

  val defaultSingle: TestValue = E"com.dslplatform.client.TypeFactory.buildIP(${"127.0.0.1"})"

  val nonDefaultValues: Seq[TestValue] = Seq(
    E"com.dslplatform.client.TypeFactory.buildIP(${"0"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"255.255.255.255"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"::1"})"
  , E"com.dslplatform.client.TypeFactory.buildIP(${"ffff::ffff"})"
  )
}
