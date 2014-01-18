package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfOneStrings_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneStrings: Option[Array[String]] = None
  ) {

    require(nullableArrayOfOneStrings ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    if (nullableArrayOfOneStrings.isDefined) require(nullableArrayOfOneStrings.get ne null, "Null value was provided for property \"nullableArrayOfOneStrings\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStrings") nullableArrayOfOneStrings: Option[Array[String]]
  ) =
    this( nullableArrayOfOneStrings = nullableArrayOfOneStrings)

}
