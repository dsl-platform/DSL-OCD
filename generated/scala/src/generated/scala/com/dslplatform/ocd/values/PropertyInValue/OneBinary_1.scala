package com.dslplatform.ocd.values.PropertyInValue

case class OneBinary_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneBinary: Array[Byte] = Array[Byte]()
  ) {

    require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this( oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}
