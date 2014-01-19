package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableText_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableText: Option[String] = None,
     calculatedNullableText: Option[String] = None,
     persistedNullableText: Option[String] = None
  ) {

    require(nullableText ne null, "Null value was provided for property \"nullableText\"")
    if (nullableText.isDefined) require(nullableText.get ne null, "Null value was provided for property \"nullableText\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableText") nullableText: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableText") calculatedNullableText: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableText") persistedNullableText: Option[String]
  ) =
    this( nullableText = nullableText, calculatedNullableText = calculatedNullableText, persistedNullableText = persistedNullableText)

}
