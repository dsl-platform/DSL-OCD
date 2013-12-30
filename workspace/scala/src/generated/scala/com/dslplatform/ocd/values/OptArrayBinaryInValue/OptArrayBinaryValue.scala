package com.dslplatform.ocd.values.OptArrayBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptArrayBinaryValue @JsonIgnore() (
     optArrayBinary: Option[Array[Array[Byte]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayBinary") optArrayBinary: Option[Array[Array[Byte]]]
  ) =
    this( optArrayBinary = optArrayBinary)

}
