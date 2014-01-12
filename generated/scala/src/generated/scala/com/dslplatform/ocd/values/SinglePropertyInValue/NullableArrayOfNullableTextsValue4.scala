package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableTextsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableTexts: Option[Array[Option[String]]] = None
  ) {

    require(nullableArrayOfNullableTexts ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
    if (nullableArrayOfNullableTexts.isDefined) require(nullableArrayOfNullableTexts.get ne null, "Null value was provided for property \"nullableArrayOfNullableTexts\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableTexts") nullableArrayOfNullableTexts: Option[Array[Option[String]]]
  ) =
    this( nullableArrayOfNullableTexts = nullableArrayOfNullableTexts)

}
