package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableDecimalWithScaleOf9Value2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDecimalWithScaleOf9: Option[BigDecimal] = None
  ) {

    require(nullableDecimalWithScaleOf9 ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    if (nullableDecimalWithScaleOf9.isDefined) require(nullableDecimalWithScaleOf9.get ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    com.dslplatform.api.Guards.checkScale(nullableDecimalWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimalWithScaleOf9") nullableDecimalWithScaleOf9: Option[BigDecimal]
  ) =
    this( nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9)

}
