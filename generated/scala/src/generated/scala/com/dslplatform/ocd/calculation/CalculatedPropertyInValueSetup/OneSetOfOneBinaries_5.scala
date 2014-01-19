package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfOneBinaries_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneBinaries: Set[Array[Byte]] = Set.empty,
     calculatedOneSetOfOneBinaries: Set[Array[Byte]] = Set.empty,
     persistedOneSetOfOneBinaries: Set[Array[Byte]] = Set.empty
  ) {

    require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBinaries") oneSetOfOneBinaries: Set[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfOneBinaries") calculatedOneSetOfOneBinaries: Set[Array[Byte]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfOneBinaries") persistedOneSetOfOneBinaries: Set[Array[Byte]]
  ) =
    this( oneSetOfOneBinaries = if (oneSetOfOneBinaries == null) Set.empty else oneSetOfOneBinaries, calculatedOneSetOfOneBinaries = calculatedOneSetOfOneBinaries, persistedOneSetOfOneBinaries = persistedOneSetOfOneBinaries)

}
