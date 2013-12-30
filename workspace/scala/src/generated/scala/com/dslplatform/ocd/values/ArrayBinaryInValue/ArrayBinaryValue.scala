package com.dslplatform.ocd.values.ArrayBinaryInValue

import com.fasterxml.jackson.annotation._

case class ArrayBinaryValue @JsonIgnore() (
     arrayBinary: Array[Array[Byte]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayBinary") arrayBinary: Array[Array[Byte]]
  ) =
    this( arrayBinary = if (arrayBinary == null) Array.empty else arrayBinary)

}
