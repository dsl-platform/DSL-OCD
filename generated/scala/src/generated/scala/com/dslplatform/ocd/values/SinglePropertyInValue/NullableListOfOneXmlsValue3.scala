package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneXmlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]] = None
  ) {

    require(nullableListOfOneXmls ne null, "Null value was provided for property \"nullableListOfOneXmls\"")
    if (nullableListOfOneXmls.isDefined) require(nullableListOfOneXmls.get ne null, "Null value was provided for property \"nullableListOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneXmls") nullableListOfOneXmls: Option[IndexedSeq[scala.xml.Elem]]
  ) =
    this( nullableListOfOneXmls = nullableListOfOneXmls)

}
