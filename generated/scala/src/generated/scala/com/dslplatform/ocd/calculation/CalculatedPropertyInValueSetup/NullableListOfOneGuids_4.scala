package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneGuids_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = None,
     calculatedNullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = None,
     persistedNullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = None
  ) {

    require(nullableListOfOneGuids ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    if (nullableListOfOneGuids.isDefined) require(nullableListOfOneGuids.get ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneGuids") nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneGuids") calculatedNullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneGuids") persistedNullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) =
    this( nullableListOfOneGuids = nullableListOfOneGuids, calculatedNullableListOfOneGuids = calculatedNullableListOfOneGuids, persistedNullableListOfOneGuids = persistedNullableListOfOneGuids)

}
