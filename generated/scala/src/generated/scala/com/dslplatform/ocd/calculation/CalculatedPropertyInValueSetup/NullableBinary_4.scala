package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableBinary_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableBinary: Option[Array[Byte]] = None,
     calculatedNullableBinary: Option[Array[Byte]] = None,
     persistedNullableBinary: Option[Array[Byte]] = None
  ) {

    require(nullableBinary ne null, "Null value was provided for property \"nullableBinary\"")
    if (nullableBinary.isDefined) require(nullableBinary.get ne null, "Null value was provided for property \"nullableBinary\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBinary") nullableBinary: Option[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableBinary") calculatedNullableBinary: Option[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableBinary") persistedNullableBinary: Option[Array[Byte]]
  ) =
    this( nullableBinary = nullableBinary, calculatedNullableBinary = calculatedNullableBinary, persistedNullableBinary = persistedNullableBinary)

}
