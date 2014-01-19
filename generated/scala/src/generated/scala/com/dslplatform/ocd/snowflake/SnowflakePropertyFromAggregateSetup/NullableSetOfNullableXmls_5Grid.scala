package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableXmls: Option[Set[Option[scala.xml.Elem]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableXmls") nullableSetOfNullableXmls: Option[Set[Option[scala.xml.Elem]]]
  ) =
    this(URI = URI, nullableSetOfNullableXmls = nullableSetOfNullableXmls)

}

object NullableSetOfNullableXmls_5Grid
