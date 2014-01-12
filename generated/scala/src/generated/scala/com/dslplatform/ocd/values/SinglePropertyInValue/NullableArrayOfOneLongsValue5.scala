package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneLongsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneLongs: Option[Array[Long]] = None
  ) {

    require(nullableArrayOfOneLongs ne null, "Null value was provided for property \"nullableArrayOfOneLongs\"")
    if (nullableArrayOfOneLongs.isDefined) require(nullableArrayOfOneLongs.get ne null, "Null value was provided for property \"nullableArrayOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneLongs") nullableArrayOfOneLongs: Option[Array[Long]]
  ) =
    this( nullableArrayOfOneLongs = nullableArrayOfOneLongs)

}
