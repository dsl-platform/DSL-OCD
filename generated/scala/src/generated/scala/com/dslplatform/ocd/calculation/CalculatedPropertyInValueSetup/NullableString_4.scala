package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableString_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableString: Option[String] = None,
     calculatedNullableString: Option[String] = None,
     persistedNullableString: Option[String] = None
  ) {

    require(nullableString ne null, "Null value was provided for property \"nullableString\"")
    if (nullableString.isDefined) require(nullableString.get ne null, "Null value was provided for property \"nullableString\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableString") nullableString: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableString") calculatedNullableString: Option[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableString") persistedNullableString: Option[String]
  ) =
    this( nullableString = nullableString, calculatedNullableString = calculatedNullableString, persistedNullableString = persistedNullableString)

}
