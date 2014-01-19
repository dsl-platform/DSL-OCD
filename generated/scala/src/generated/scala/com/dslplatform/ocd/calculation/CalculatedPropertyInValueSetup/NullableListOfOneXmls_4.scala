package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableListOfOneXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]] = None,
     calculatedNullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]] = None,
     persistedNullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]] = None
  ) {

    require(nullableListOfOneXmls ne null, "Null value was provided for property \"nullableListOfOneXmls\"")
    if (nullableListOfOneXmls.isDefined) require(nullableListOfOneXmls.get ne null, "Null value was provided for property \"nullableListOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneXmls") nullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneXmls") calculatedNullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneXmls") persistedNullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]]
  ) =
    this( nullableListOfOneXmls = nullableListOfOneXmls, calculatedNullableListOfOneXmls = calculatedNullableListOfOneXmls, persistedNullableListOfOneXmls = persistedNullableListOfOneXmls)

}
