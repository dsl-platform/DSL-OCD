package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableXmlsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableXmls: Set[Option[scala.xml.Elem]] = Set.empty
  ) {

    require(oneSetOfNullableXmls ne null, "Null value was provided for property \"oneSetOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableXmls") oneSetOfNullableXmls: Set[Option[scala.xml.Elem]]
  ) =
    this( oneSetOfNullableXmls = if (oneSetOfNullableXmls == null) Set.empty else oneSetOfNullableXmls)

}
