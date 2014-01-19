package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfNullableBinaries_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty,
     calculatedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty,
     persistedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty
  ) {

    require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries") oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableBinaries") calculatedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableBinaries") persistedOneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) =
    this( oneArrayOfNullableBinaries = if (oneArrayOfNullableBinaries == null) Array.empty else oneArrayOfNullableBinaries, calculatedOneArrayOfNullableBinaries = calculatedOneArrayOfNullableBinaries, persistedOneArrayOfNullableBinaries = persistedOneArrayOfNullableBinaries)

}
