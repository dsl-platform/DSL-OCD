package com.dslplatform.ocd.values.OptSetBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptSetBinaryValue @JsonIgnore() (
     optSetBinary: Option[Set[Array[Byte]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetBinary") optSetBinary: Option[Set[Array[Byte]]]
  ) =
    this( optSetBinary = optSetBinary)

}
