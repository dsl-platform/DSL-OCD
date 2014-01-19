package com.dslplatform.ocd.values.PropertyInValue

case class OneXml_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneXml: scala.xml.Elem = null
  ) {

    require(oneXml ne null, "Null value was provided for property \"oneXml\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneXml") oneXml: scala.xml.Elem
  ) =
    this( oneXml = if (oneXml == null) null else oneXml)

}
