package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableUrl_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableUrl: Option[java.net.URI] = None,
     calculatedNullableUrl: Option[java.net.URI] = None,
     persistedNullableUrl: Option[java.net.URI] = None
  ) {

    require(nullableUrl ne null, "Null value was provided for property \"nullableUrl\"")
    if (nullableUrl.isDefined) require(nullableUrl.get ne null, "Null value was provided for property \"nullableUrl\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableUrl") nullableUrl: Option[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableUrl") calculatedNullableUrl: Option[java.net.URI]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableUrl") persistedNullableUrl: Option[java.net.URI]
  ) =
    this( nullableUrl = nullableUrl, calculatedNullableUrl = calculatedNullableUrl, persistedNullableUrl = persistedNullableUrl)

}
