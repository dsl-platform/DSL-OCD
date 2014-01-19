package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableXml_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableXml: Option[scala.xml.Elem] = None,
     calculatedNullableXml: Option[scala.xml.Elem] = None,
     persistedNullableXml: Option[scala.xml.Elem] = None
  ) {

    require(nullableXml ne null, "Null value was provided for property \"nullableXml\"")
    if (nullableXml.isDefined) require(nullableXml.get ne null, "Null value was provided for property \"nullableXml\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableXml") nullableXml: Option[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableXml") calculatedNullableXml: Option[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableXml") persistedNullableXml: Option[scala.xml.Elem]
  ) =
    this( nullableXml = nullableXml, calculatedNullableXml = calculatedNullableXml, persistedNullableXml = persistedNullableXml)

}
