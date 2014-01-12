package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableLongsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableLongs: Array[Option[Long]] = Array.empty
  ) {

    require(oneArrayOfNullableLongs ne null, "Null value was provided for property \"oneArrayOfNullableLongs\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(oneArrayOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableLongs") oneArrayOfNullableLongs: Array[Option[Long]]
  ) =
    this( oneArrayOfNullableLongs = if (oneArrayOfNullableLongs == null) Array.empty else oneArrayOfNullableLongs)

}
