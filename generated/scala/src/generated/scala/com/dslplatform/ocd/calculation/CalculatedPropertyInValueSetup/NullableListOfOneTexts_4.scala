package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneTexts_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneTexts: Option[IndexedSeq[String]] = None,
     calculatedNullableListOfOneTexts: Option[IndexedSeq[String]] = None,
     persistedNullableListOfOneTexts: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneTexts ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    if (nullableListOfOneTexts.isDefined) require(nullableListOfOneTexts.get ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTexts") nullableListOfOneTexts: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTexts") calculatedNullableListOfOneTexts: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTexts") persistedNullableListOfOneTexts: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneTexts = nullableListOfOneTexts, calculatedNullableListOfOneTexts = calculatedNullableListOfOneTexts, persistedNullableListOfOneTexts = persistedNullableListOfOneTexts)

}
