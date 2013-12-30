package com.dslplatform.ocd.values.OptArrayDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptArrayDoubleValue @JsonIgnore() (
     optArrayDouble: Option[Array[Double]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayDouble") optArrayDouble: Option[Array[Double]]
  ) =
    this( optArrayDouble = optArrayDouble)

}
