package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableSetOfOneXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneXmls: Option[Set[scala.xml.Elem]] = None,
     calculatedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]] = None,
     persistedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]] = None
  ) {

    require(nullableSetOfOneXmls ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
    if (nullableSetOfOneXmls.isDefined) require(nullableSetOfOneXmls.get ne null, "Null value was provided for property \"nullableSetOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneXmls") nullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneXmls") calculatedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneXmls") persistedNullableSetOfOneXmls: Option[Set[scala.xml.Elem]]
  ) =
    this( nullableSetOfOneXmls = nullableSetOfOneXmls, calculatedNullableSetOfOneXmls = calculatedNullableSetOfOneXmls, persistedNullableSetOfOneXmls = persistedNullableSetOfOneXmls)

}
