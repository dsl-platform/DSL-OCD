package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneIntegersValue11 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneIntegers: Option[Array[Int]] = None
  ) {

    require(nullableArrayOfOneIntegers ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")
    if (nullableArrayOfOneIntegers.isDefined) require(nullableArrayOfOneIntegers.get ne null, "Null value was provided for property \"nullableArrayOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneIntegers") nullableArrayOfOneIntegers: Option[Array[Int]]
  ) =
    this( nullableArrayOfOneIntegers = nullableArrayOfOneIntegers)

}
