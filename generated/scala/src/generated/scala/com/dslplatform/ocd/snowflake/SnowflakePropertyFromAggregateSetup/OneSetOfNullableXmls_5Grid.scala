package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneSetOfNullableXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableXmls") oneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) =
    this(URI = URI, oneSetOfNullableXmls = if (oneSetOfNullableXmls == null) Set.empty else oneSetOfNullableXmls)

}

object OneSetOfNullableXmls_5Grid
