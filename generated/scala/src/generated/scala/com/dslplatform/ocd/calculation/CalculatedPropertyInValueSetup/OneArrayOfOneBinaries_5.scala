package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneBinaries_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneBinaries: Array[Array[Byte]] = Array.empty,
     calculatedOneArrayOfOneBinaries: Array[Array[Byte]] = Array.empty,
     persistedOneArrayOfOneBinaries: Array[Array[Byte]] = Array.empty
  ) {

    require(oneArrayOfOneBinaries ne null, "Null value was provided for property \"oneArrayOfOneBinaries\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneBinaries") oneArrayOfOneBinaries: Array[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneBinaries") calculatedOneArrayOfOneBinaries: Array[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneBinaries") persistedOneArrayOfOneBinaries: Array[Array[Byte]]
  ) =
    this( oneArrayOfOneBinaries = if (oneArrayOfOneBinaries == null) Array.empty else oneArrayOfOneBinaries, calculatedOneArrayOfOneBinaries = calculatedOneArrayOfOneBinaries, persistedOneArrayOfOneBinaries = persistedOneArrayOfOneBinaries)

}
