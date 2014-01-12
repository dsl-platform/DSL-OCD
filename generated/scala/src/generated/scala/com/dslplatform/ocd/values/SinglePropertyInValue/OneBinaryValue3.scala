package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneBinaryValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBinary: Array[Byte] = Array[Byte]()
  ) {

    require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this( oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}
