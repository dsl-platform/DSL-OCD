package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableLong_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableLong: Option[Long] = None,
     calculatedNullableLong: Option[Long] = None,
     persistedNullableLong: Option[Long] = None
  ) {

    require(nullableLong ne null, "Null value was provided for property \"nullableLong\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLong") nullableLong: Option[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableLong") calculatedNullableLong: Option[Long]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableLong") persistedNullableLong: Option[Long]
  ) =
    this( nullableLong = nullableLong, calculatedNullableLong = calculatedNullableLong, persistedNullableLong = persistedNullableLong)

}
