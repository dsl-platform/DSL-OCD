package com.dslplatform.ocd.values.OptArrayOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptBinaryValue @JsonIgnore() (
     optArrayOptBinary: Option[Array[Option[Array[Byte]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptBinary") optArrayOptBinary: Option[Array[Option[Array[Byte]]]]
  ) =
    this( optArrayOptBinary = optArrayOptBinary)

}
