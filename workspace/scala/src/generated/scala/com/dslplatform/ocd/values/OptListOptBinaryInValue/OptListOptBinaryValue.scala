package com.dslplatform.ocd.values.OptListOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptListOptBinaryValue @JsonIgnore() (
     optListOptBinary: Option[IndexedSeq[Option[Array[Byte]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptBinary") optListOptBinary: Option[IndexedSeq[Option[Array[Byte]]]]
  ) =
    this( optListOptBinary = optListOptBinary)

}
