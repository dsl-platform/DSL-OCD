package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfOneLongsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneLongs: Array[Long] = Array.empty
  ) {

    require(oneArrayOfOneLongs ne null, "Null value was provided for property \"oneArrayOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneLongs") oneArrayOfOneLongs: Array[Long]
  ) =
    this( oneArrayOfOneLongs = if (oneArrayOfOneLongs == null) Array.empty else oneArrayOfOneLongs)

}
