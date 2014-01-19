package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfOneTimestamps_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]] = None,
     calculatedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]] = None,
     persistedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]] = None
  ) {

    require(nullableArrayOfOneTimestamps ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
    if (nullableArrayOfOneTimestamps.isDefined) require(nullableArrayOfOneTimestamps.get ne null, "Null value was provided for property \"nullableArrayOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneTimestamps") nullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfOneTimestamps") calculatedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfOneTimestamps") persistedNullableArrayOfOneTimestamps: Option[Array[org.joda.time.DateTime]]
  ) =
    this( nullableArrayOfOneTimestamps = nullableArrayOfOneTimestamps, calculatedNullableArrayOfOneTimestamps = calculatedNullableArrayOfOneTimestamps, persistedNullableArrayOfOneTimestamps = persistedNullableArrayOfOneTimestamps)

}
