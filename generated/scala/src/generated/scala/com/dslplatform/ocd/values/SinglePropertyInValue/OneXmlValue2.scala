package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneXmlValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneXml: scala.xml.Elem = ???
  ) {

    require(oneXml ne null, "Null value was provided for property \"oneXml\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneXml") oneXml: scala.xml.Elem
  ) =
    this( oneXml = if (oneXml == null) ??? else oneXml)

}
