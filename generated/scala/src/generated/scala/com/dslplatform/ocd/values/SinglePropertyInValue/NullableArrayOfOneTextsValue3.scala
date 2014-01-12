package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneTextsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneTexts: Option[Array[String]] = None
  ) {

    require(nullableArrayOfOneTexts ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    if (nullableArrayOfOneTexts.isDefined) require(nullableArrayOfOneTexts.get ne null, "Null value was provided for property \"nullableArrayOfOneTexts\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTexts") nullableArrayOfOneTexts: Option[Array[String]]
  ) =
    this( nullableArrayOfOneTexts = nullableArrayOfOneTexts)

}
