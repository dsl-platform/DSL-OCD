package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneMoniesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneMonies: Array[BigDecimal] = Array.empty
  ) {

    require(oneArrayOfOneMonies ne null, "Null value was provided for property \"oneArrayOfOneMonies\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneMonies") oneArrayOfOneMonies: Array[BigDecimal]
  ) =
    this( oneArrayOfOneMonies = if (oneArrayOfOneMonies == null) Array.empty else oneArrayOfOneMonies)

}
