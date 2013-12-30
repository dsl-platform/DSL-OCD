package com.dslplatform.ocd.values.ArrayOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptBinaryValue @JsonIgnore() (
     arrayOptBinary: Array[Option[Array[Byte]]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptBinary") arrayOptBinary: Array[Option[Array[Byte]]]
  ) =
    this( arrayOptBinary = if (arrayOptBinary == null) Array.empty else arrayOptBinary)

}
