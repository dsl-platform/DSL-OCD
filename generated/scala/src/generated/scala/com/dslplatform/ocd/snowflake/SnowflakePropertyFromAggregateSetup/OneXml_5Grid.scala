package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class OneXml_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     oneXml: scala.xml.Elem
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneXml") oneXml: scala.xml.Elem
  ) =
    this(URI = URI, oneXml = if (oneXml == null) null else oneXml)

}

object OneXml_5Grid
