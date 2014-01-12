package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneMoniesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneMonies: Option[Array[BigDecimal]] = None
  ) {

    require(nullableArrayOfOneMonies ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    if (nullableArrayOfOneMonies.isDefined) require(nullableArrayOfOneMonies.get ne null, "Null value was provided for property \"nullableArrayOfOneMonies\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneMonies") nullableArrayOfOneMonies: Option[Array[BigDecimal]]
  ) =
    this( nullableArrayOfOneMonies = nullableArrayOfOneMonies)

}
