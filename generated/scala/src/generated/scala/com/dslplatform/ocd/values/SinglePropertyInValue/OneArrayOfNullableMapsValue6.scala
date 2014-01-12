package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneArrayOfNullableMapsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfNullableMaps: Array[Option[Map[String, String]]] = Array.empty
  ) {

    require(oneArrayOfNullableMaps ne null, "Null value was provided for property \"oneArrayOfNullableMaps\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMaps") oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) =
    this( oneArrayOfNullableMaps = if (oneArrayOfNullableMaps == null) Array.empty else oneArrayOfNullableMaps)

}
