package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableBinariesValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty
  ) {

    require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries") oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) =
    this( oneArrayOfNullableBinaries = if (oneArrayOfNullableBinaries == null) Array.empty else oneArrayOfNullableBinaries)

}
