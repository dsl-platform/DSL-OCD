package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneGuids_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneGuids: Option[Set[java.util.UUID]] = None,
     calculatedNullableSetOfOneGuids: Option[Set[java.util.UUID]] = None,
     persistedNullableSetOfOneGuids: Option[Set[java.util.UUID]] = None
  ) {

    require(nullableSetOfOneGuids ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
    if (nullableSetOfOneGuids.isDefined) require(nullableSetOfOneGuids.get ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneGuids") nullableSetOfOneGuids: Option[Set[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneGuids") calculatedNullableSetOfOneGuids: Option[Set[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneGuids") persistedNullableSetOfOneGuids: Option[Set[java.util.UUID]]
  ) =
    this( nullableSetOfOneGuids = nullableSetOfOneGuids, calculatedNullableSetOfOneGuids = calculatedNullableSetOfOneGuids, persistedNullableSetOfOneGuids = persistedNullableSetOfOneGuids)

}
