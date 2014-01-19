package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableBinaries_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableBinaries: Set[Option[Array[Byte]]] = Set.empty,
     calculatedOneSetOfNullableBinaries: Set[Option[Array[Byte]]] = Set.empty,
     persistedOneSetOfNullableBinaries: Set[Option[Array[Byte]]] = Set.empty
  ) {

    require(oneSetOfNullableBinaries ne null, "Null value was provided for property \"oneSetOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableBinaries") oneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableBinaries") calculatedOneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableBinaries") persistedOneSetOfNullableBinaries: Set[Option[Array[Byte]]]
  ) =
    this( oneSetOfNullableBinaries = if (oneSetOfNullableBinaries == null) Set.empty else oneSetOfNullableBinaries, calculatedOneSetOfNullableBinaries = calculatedOneSetOfNullableBinaries, persistedOneSetOfNullableBinaries = persistedOneSetOfNullableBinaries)

}
