package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfOneBinaries_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfOneBinaries: Option[Array[Array[Byte]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneBinaries") nullableArrayOfOneBinaries: Option[Array[Array[Byte]]]
  ) =
    this(URI = URI, nullableArrayOfOneBinaries = nullableArrayOfOneBinaries)

}

object NullableArrayOfOneBinaries_5Grid
