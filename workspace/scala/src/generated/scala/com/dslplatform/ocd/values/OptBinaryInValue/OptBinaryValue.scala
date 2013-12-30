package com.dslplatform.ocd.values.OptBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptBinaryValue @JsonIgnore() (
     optBinary: Option[Array[Byte]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optBinary") optBinary: Option[Array[Byte]]
  ) =
    this( optBinary = optBinary)

}
