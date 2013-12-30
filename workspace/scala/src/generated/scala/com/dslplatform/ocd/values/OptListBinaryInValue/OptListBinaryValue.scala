package com.dslplatform.ocd.values.OptListBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptListBinaryValue @JsonIgnore() (
     optListBinary: Option[IndexedSeq[Array[Byte]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListBinary") optListBinary: Option[IndexedSeq[Array[Byte]]]
  ) =
    this( optListBinary = optListBinary)

}
