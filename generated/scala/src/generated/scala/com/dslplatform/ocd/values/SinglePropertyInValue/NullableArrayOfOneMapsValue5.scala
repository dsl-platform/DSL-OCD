package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneMapsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneMaps: Option[Array[Map[String, String]]] = None
  ) {

    require(nullableArrayOfOneMaps ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    if (nullableArrayOfOneMaps.isDefined) require(nullableArrayOfOneMaps.get ne null, "Null value was provided for property \"nullableArrayOfOneMaps\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMaps") nullableArrayOfOneMaps: Option[Array[Map[String, String]]]
  ) =
    this( nullableArrayOfOneMaps = nullableArrayOfOneMaps)

}
