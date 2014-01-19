package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfNullableStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfNullableStringsWithMaxLengthOf9: Option[Set[Option[String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9") nullableSetOfNullableStringsWithMaxLengthOf9: Option[Set[Option[String]]]
  ) =
    this(URI = URI, nullableSetOfNullableStringsWithMaxLengthOf9 = nullableSetOfNullableStringsWithMaxLengthOf9)

}

object NullableSetOfNullableStringsWithMaxLengthOf9_5Grid
