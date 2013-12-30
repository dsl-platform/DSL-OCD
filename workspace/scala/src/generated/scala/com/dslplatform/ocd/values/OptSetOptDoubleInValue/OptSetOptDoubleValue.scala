package com.dslplatform.ocd.values.OptSetOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptDoubleValue @JsonIgnore() (
     optSetOptDouble: Option[Set[Option[Double]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptDouble") optSetOptDouble: Option[Set[Option[Double]]]
  ) =
    this( optSetOptDouble = optSetOptDouble)

}
