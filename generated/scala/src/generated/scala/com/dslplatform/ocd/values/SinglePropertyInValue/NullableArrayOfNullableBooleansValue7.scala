package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableBooleansValue7 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]] = None
  ) {

    require(nullableArrayOfNullableBooleans ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
    if (nullableArrayOfNullableBooleans.isDefined) require(nullableArrayOfNullableBooleans.get ne null, "Null value was provided for property \"nullableArrayOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBooleans") nullableArrayOfNullableBooleans: Option[Array[Option[Boolean]]]
  ) =
    this( nullableArrayOfNullableBooleans = nullableArrayOfNullableBooleans)

}
