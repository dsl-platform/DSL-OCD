package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneFloats_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneFloats: Array[Float] = Array.empty,
     calculatedOneArrayOfOneFloats: Array[Float] = Array.empty,
     persistedOneArrayOfOneFloats: Array[Float] = Array.empty
  ) {

    require(oneArrayOfOneFloats ne null, "Null value was provided for property \"oneArrayOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneFloats") oneArrayOfOneFloats: Array[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneFloats") calculatedOneArrayOfOneFloats: Array[Float]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneFloats") persistedOneArrayOfOneFloats: Array[Float]
  ) =
    this( oneArrayOfOneFloats = if (oneArrayOfOneFloats == null) Array.empty else oneArrayOfOneFloats, calculatedOneArrayOfOneFloats = calculatedOneArrayOfOneFloats, persistedOneArrayOfOneFloats = persistedOneArrayOfOneFloats)

}
