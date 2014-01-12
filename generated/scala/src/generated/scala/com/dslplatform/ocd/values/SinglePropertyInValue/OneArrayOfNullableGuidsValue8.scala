package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableGuidsValue8 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableGuids: Array[Option[java.util.UUID]] = Array.empty
  ) {

    require(oneArrayOfNullableGuids ne null, "Null value was provided for property \"oneArrayOfNullableGuids\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableGuids") oneArrayOfNullableGuids: Array[Option[java.util.UUID]]
  ) =
    this( oneArrayOfNullableGuids = if (oneArrayOfNullableGuids == null) Array.empty else oneArrayOfNullableGuids)

}
