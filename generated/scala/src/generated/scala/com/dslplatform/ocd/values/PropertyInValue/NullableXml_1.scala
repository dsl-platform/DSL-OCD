package com.dslplatform.ocd.values.PropertyInValue

case class NullableXml_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableXml: Option[scala.xml.Elem] = None
  ) {

    require(nullableXml ne null, "Null value was provided for property \"nullableXml\"")
    if (nullableXml.isDefined) require(nullableXml.get ne null, "Null value was provided for property \"nullableXml\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableXml") nullableXml: Option[scala.xml.Elem]
  ) =
    this( nullableXml = nullableXml)

}