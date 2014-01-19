package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneListOfOneXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneXmls") oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) =
    this(URI = URI, oneListOfOneXmls = if (oneListOfOneXmls == null) IndexedSeq.empty else oneListOfOneXmls)

}

object OneListOfOneXmls_5Grid
