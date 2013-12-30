package com.dslplatform.ocd.values.OptSetOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptBinaryValue @JsonIgnore() (
     optSetOptBinary: Option[Set[Option[Array[Byte]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptBinary") optSetOptBinary: Option[Set[Option[Array[Byte]]]]
  ) =
    this( optSetOptBinary = optSetOptBinary)

}
