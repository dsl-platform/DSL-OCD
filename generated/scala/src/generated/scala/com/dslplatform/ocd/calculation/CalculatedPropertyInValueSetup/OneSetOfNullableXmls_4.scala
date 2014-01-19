package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneSetOfNullableXmls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = Set.empty,
     calculatedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = Set.empty,
     persistedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = Set.empty
  ) {

    require(oneSetOfNullableXmls ne null, "Null value was provided for property \"oneSetOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableXmls") oneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableXmls") calculatedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableXmls") persistedOneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) =
    this( oneSetOfNullableXmls = if (oneSetOfNullableXmls == null) Set.empty else oneSetOfNullableXmls, calculatedOneSetOfNullableXmls = calculatedOneSetOfNullableXmls, persistedOneSetOfNullableXmls = persistedOneSetOfNullableXmls)

}
