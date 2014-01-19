package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfNullableBinaries_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = None,
     calculatedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = None,
     persistedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = None
  ) {

    require(nullableSetOfNullableBinaries ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    if (nullableSetOfNullableBinaries.isDefined) require(nullableSetOfNullableBinaries.get ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBinaries") nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableBinaries") calculatedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableBinaries") persistedNullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) =
    this( nullableSetOfNullableBinaries = nullableSetOfNullableBinaries, calculatedNullableSetOfNullableBinaries = calculatedNullableSetOfNullableBinaries, persistedNullableSetOfNullableBinaries = persistedNullableSetOfNullableBinaries)

}
