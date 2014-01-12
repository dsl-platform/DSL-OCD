package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneGuidsValue9 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneGuids: Array[java.util.UUID] = Array.empty
  ) {

    require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids") oneArrayOfOneGuids: Array[java.util.UUID]
  ) =
    this( oneArrayOfOneGuids = if (oneArrayOfOneGuids == null) Array.empty else oneArrayOfOneGuids)

}
