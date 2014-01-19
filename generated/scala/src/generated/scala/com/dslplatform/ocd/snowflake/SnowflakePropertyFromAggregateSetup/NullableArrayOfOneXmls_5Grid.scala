package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneXmls: Option[Array[scala.xml.Elem]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneXmls") nullableArrayOfOneXmls: Option[Array[scala.xml.Elem]]
  ) =
    this(URI = URI, nullableArrayOfOneXmls = nullableArrayOfOneXmls)

}

object NullableArrayOfOneXmls_5Grid
