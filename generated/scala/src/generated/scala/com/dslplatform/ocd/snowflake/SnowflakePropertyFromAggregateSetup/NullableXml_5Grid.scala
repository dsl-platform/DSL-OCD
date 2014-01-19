package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableXml_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableXml: Option[scala.xml.Elem]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableXml") nullableXml: Option[scala.xml.Elem]
  ) =
    this(URI = URI, nullableXml = nullableXml)

}

object NullableXml_5Grid
