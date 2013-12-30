package com.dslplatform.ocd.values.OneBinaryInValue

import com.fasterxml.jackson.annotation._

case class OneBinaryValue @JsonIgnore() (
     oneBinary: Array[Byte] = Array[Byte]()
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this( oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}
