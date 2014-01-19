package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneXml_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneXml: scala.xml.Elem = null,
     calculatedOneXml: scala.xml.Elem = null,
     persistedOneXml: scala.xml.Elem = null
  ) {

    require(oneXml ne null, "Null value was provided for property \"oneXml\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneXml") oneXml: scala.xml.Elem
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneXml") calculatedOneXml: scala.xml.Elem
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneXml") persistedOneXml: scala.xml.Elem
  ) =
    this( oneXml = if (oneXml == null) null else oneXml, calculatedOneXml = if (calculatedOneXml == null) null else calculatedOneXml, persistedOneXml = if (persistedOneXml == null) null else persistedOneXml)

}
