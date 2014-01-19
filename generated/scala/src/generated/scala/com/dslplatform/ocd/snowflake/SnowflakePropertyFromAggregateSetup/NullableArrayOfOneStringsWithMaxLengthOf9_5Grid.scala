package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9") nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  ) =
    this(URI = URI, nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9)

}

object NullableArrayOfOneStringsWithMaxLengthOf9_5Grid
