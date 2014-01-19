package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableXmls") nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  ) =
    this(URI = URI, nullableArrayOfNullableXmls = nullableArrayOfNullableXmls)

}

object NullableArrayOfNullableXmls_5Grid
