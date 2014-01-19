package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableListOfNullableStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableListOfNullableStringsWithMaxLengthOf9: Option[IndexedSeq[Option[String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableStringsWithMaxLengthOf9") nullableListOfNullableStringsWithMaxLengthOf9: Option[IndexedSeq[Option[String]]]
  ) =
    this(URI = URI, nullableListOfNullableStringsWithMaxLengthOf9 = nullableListOfNullableStringsWithMaxLengthOf9)

}

object NullableListOfNullableStringsWithMaxLengthOf9_5Grid
