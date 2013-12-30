package com.dslplatform.ocd.values.OptListOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptListOptDoubleValue @JsonIgnore() (
     optListOptDouble: Option[IndexedSeq[Option[Double]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptDouble") optListOptDouble: Option[IndexedSeq[Option[Double]]]
  ) =
    this( optListOptDouble = optListOptDouble)

}
