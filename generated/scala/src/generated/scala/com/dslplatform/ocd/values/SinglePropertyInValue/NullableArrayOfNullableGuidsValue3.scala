package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableGuidsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableGuids: Option[Array[Option[java.util.UUID]]] = None
  ) {

    require(nullableArrayOfNullableGuids ne null, "Null value was provided for property \"nullableArrayOfNullableGuids\"")
    if (nullableArrayOfNullableGuids.isDefined) require(nullableArrayOfNullableGuids.get ne null, "Null value was provided for property \"nullableArrayOfNullableGuids\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableGuids") nullableArrayOfNullableGuids: Option[Array[Option[java.util.UUID]]]
  ) =
    this( nullableArrayOfNullableGuids = nullableArrayOfNullableGuids)

}
