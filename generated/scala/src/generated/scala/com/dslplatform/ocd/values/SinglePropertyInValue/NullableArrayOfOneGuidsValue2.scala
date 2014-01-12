package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneGuidsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneGuids: Option[Array[java.util.UUID]] = None
  ) {

    require(nullableArrayOfOneGuids ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
    if (nullableArrayOfOneGuids.isDefined) require(nullableArrayOfOneGuids.get ne null, "Null value was provided for property \"nullableArrayOfOneGuids\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneGuids") nullableArrayOfOneGuids: Option[Array[java.util.UUID]]
  ) =
    this( nullableArrayOfOneGuids = nullableArrayOfOneGuids)

}
