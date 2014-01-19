package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableXmls_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableXmls") nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) =
    this(URI = URI, nullableListOfNullableXmls = nullableListOfNullableXmls)

}

object NullableListOfNullableXmls_5Grid
