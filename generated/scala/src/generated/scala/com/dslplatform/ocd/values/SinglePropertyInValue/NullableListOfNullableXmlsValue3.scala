package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableXmlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]] = None
  ) {

    require(nullableListOfNullableXmls ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
    if (nullableListOfNullableXmls.isDefined) require(nullableListOfNullableXmls.get ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableXmls") nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) =
    this( nullableListOfNullableXmls = nullableListOfNullableXmls)

}
