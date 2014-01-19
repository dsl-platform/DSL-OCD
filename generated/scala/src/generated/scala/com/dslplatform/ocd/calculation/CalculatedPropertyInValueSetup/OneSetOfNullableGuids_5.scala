package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableGuids_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty,
     calculatedOneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty,
     persistedOneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty
  ) {

    require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids") oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableGuids") calculatedOneSetOfNullableGuids: Set[Option[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableGuids") persistedOneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) =
    this( oneSetOfNullableGuids = if (oneSetOfNullableGuids == null) Set.empty else oneSetOfNullableGuids, calculatedOneSetOfNullableGuids = calculatedOneSetOfNullableGuids, persistedOneSetOfNullableGuids = persistedOneSetOfNullableGuids)

}
