package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfNullableMonies_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]] = None
  ) {

    require(nullableArrayOfNullableMonies ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    if (nullableArrayOfNullableMonies.isDefined) require(nullableArrayOfNullableMonies.get ne null, "Null value was provided for property \"nullableArrayOfNullableMonies\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableMonies") nullableArrayOfNullableMonies: Option[Array[Option[BigDecimal]]]
  ) =
    this( nullableArrayOfNullableMonies = nullableArrayOfNullableMonies)

}