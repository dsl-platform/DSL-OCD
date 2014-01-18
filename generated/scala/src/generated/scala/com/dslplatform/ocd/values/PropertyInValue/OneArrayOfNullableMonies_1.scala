package com.dslplatform.ocd.values.PropertyInValue

case class OneArrayOfNullableMonies_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableMonies: Array[Option[BigDecimal]] = Array.empty
  ) {

    require(oneArrayOfNullableMonies ne null, "Null value was provided for property \"oneArrayOfNullableMonies\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMonies") oneArrayOfNullableMonies: Array[Option[BigDecimal]]
  ) =
    this( oneArrayOfNullableMonies = if (oneArrayOfNullableMonies == null) Array.empty else oneArrayOfNullableMonies)

}
