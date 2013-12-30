package com.dslplatform.ocd.values.SetOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class SetOptBinaryValue @JsonIgnore() (
     setOptBinary: Set[Option[Array[Byte]]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptBinary") setOptBinary: Set[Option[Array[Byte]]]
  ) =
    this( setOptBinary = if (setOptBinary == null) Set.empty else setOptBinary)

}
