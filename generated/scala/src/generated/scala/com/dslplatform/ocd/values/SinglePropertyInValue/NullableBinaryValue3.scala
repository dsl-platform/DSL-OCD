package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableBinaryValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableBinary: Option[Array[Byte]] = None
  ) {

    require(nullableBinary ne null, "Null value was provided for property \"nullableBinary\"")
    if (nullableBinary.isDefined) require(nullableBinary.get ne null, "Null value was provided for property \"nullableBinary\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableBinary") nullableBinary: Option[Array[Byte]]
  ) =
    this( nullableBinary = nullableBinary)

}
