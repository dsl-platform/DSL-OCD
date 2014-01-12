package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableMapsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]] = None
  ) {

    require(nullableArrayOfNullableMaps ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    if (nullableArrayOfNullableMaps.isDefined) require(nullableArrayOfNullableMaps.get ne null, "Null value was provided for property \"nullableArrayOfNullableMaps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMaps") nullableArrayOfNullableMaps: Option[Array[Option[Map[String, String]]]]
  ) =
    this( nullableArrayOfNullableMaps = nullableArrayOfNullableMaps)

}
