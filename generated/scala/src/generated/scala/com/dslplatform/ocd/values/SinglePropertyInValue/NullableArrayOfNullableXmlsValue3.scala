package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableXmlsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]] = None
  ) {

    require(nullableArrayOfNullableXmls ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
    if (nullableArrayOfNullableXmls.isDefined) require(nullableArrayOfNullableXmls.get ne null, "Null value was provided for property \"nullableArrayOfNullableXmls\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableXmls") nullableArrayOfNullableXmls: Option[Array[Option[scala.xml.Elem]]]
  ) =
    this( nullableArrayOfNullableXmls = nullableArrayOfNullableXmls)

}
