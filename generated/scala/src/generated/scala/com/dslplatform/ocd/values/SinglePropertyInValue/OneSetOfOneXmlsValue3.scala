package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneXmlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneXmls: Set[scala.xml.Elem] = Set.empty
  ) {

    require(oneSetOfOneXmls ne null, "Null value was provided for property \"oneSetOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneXmls") oneSetOfOneXmls: Set[scala.xml.Elem]
  ) =
    this( oneSetOfOneXmls = if (oneSetOfOneXmls == null) Set.empty else oneSetOfOneXmls)

}
