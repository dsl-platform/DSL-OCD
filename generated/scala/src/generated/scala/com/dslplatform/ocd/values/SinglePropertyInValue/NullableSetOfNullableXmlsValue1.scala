package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableXmlsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableXmls: Option[Set[Option[scala.xml.Elem]]] = None
  ) {

    require(nullableSetOfNullableXmls ne null, "Null value was provided for property \"nullableSetOfNullableXmls\"")
    if (nullableSetOfNullableXmls.isDefined) require(nullableSetOfNullableXmls.get ne null, "Null value was provided for property \"nullableSetOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableXmls") nullableSetOfNullableXmls: Option[Set[Option[scala.xml.Elem]]]
  ) =
    this( nullableSetOfNullableXmls = nullableSetOfNullableXmls)

}
