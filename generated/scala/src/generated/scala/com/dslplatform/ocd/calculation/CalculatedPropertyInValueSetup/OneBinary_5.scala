package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneBinary_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBinary: Array[Byte] = Array[Byte](),
     calculatedOneBinary: Array[Byte] = Array[Byte](),
     persistedOneBinary: Array[Byte] = Array[Byte]()
  ) {

    require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneBinary") calculatedOneBinary: Array[Byte]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneBinary") persistedOneBinary: Array[Byte]
  ) =
    this( oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary, calculatedOneBinary = if (calculatedOneBinary == null) Array[Byte]() else calculatedOneBinary, persistedOneBinary = if (persistedOneBinary == null) Array[Byte]() else persistedOneBinary)

}
