package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableDecimalWithScaleOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableDecimalWithScaleOf9: Option[BigDecimal] = None,
     calculatedNullableDecimalWithScaleOf9: Option[BigDecimal] = None,
     persistedNullableDecimalWithScaleOf9: Option[BigDecimal] = None
  ) {

    require(nullableDecimalWithScaleOf9 ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    if (nullableDecimalWithScaleOf9.isDefined) require(nullableDecimalWithScaleOf9.get ne null, "Null value was provided for property \"nullableDecimalWithScaleOf9\"")
    com.dslplatform.api.Guards.checkScale(nullableDecimalWithScaleOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableDecimalWithScaleOf9") nullableDecimalWithScaleOf9: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableDecimalWithScaleOf9") calculatedNullableDecimalWithScaleOf9: Option[BigDecimal]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableDecimalWithScaleOf9") persistedNullableDecimalWithScaleOf9: Option[BigDecimal]
  ) =
    this( nullableDecimalWithScaleOf9 = nullableDecimalWithScaleOf9, calculatedNullableDecimalWithScaleOf9 = calculatedNullableDecimalWithScaleOf9, persistedNullableDecimalWithScaleOf9 = persistedNullableDecimalWithScaleOf9)

}
