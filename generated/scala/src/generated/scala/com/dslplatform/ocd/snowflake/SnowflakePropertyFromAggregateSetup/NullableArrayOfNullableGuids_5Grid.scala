package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._

case class NullableArrayOfNullableGuids_5Grid @com.fasterxml.jackson.annotation.JsonIgnore() (
    URI: String,
     nullableArrayOfNullableGuids: Option[Array[Option[java.util.UUID]]]
  ) extends Identifiable {

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableGuids") nullableArrayOfNullableGuids: Option[Array[Option[java.util.UUID]]]
  ) =
    this(URI = URI, nullableArrayOfNullableGuids = nullableArrayOfNullableGuids)

}

object NullableArrayOfNullableGuids_5Grid
