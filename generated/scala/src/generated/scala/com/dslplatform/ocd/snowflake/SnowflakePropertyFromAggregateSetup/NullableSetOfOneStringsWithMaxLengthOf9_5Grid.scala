package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableSetOfOneStringsWithMaxLengthOf9_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9") nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) =
    this(URI = URI, nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9)

}

object NullableSetOfOneStringsWithMaxLengthOf9_5Grid
