package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9") nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  ) =
    this(URI = URI, nullableArrayOfNullableStringsWithMaxLengthOf9 = nullableArrayOfNullableStringsWithMaxLengthOf9)

}

object NullableArrayOfNullableStringsWithMaxLengthOf9_5Grid
