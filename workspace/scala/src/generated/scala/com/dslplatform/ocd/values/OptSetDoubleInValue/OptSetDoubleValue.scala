package com.dslplatform.ocd.values.OptSetDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptSetDoubleValue @JsonIgnore() (
     optSetDouble: Option[Set[Double]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetDouble") optSetDouble: Option[Set[Double]]
  ) =
    this( optSetDouble = optSetDouble)

}
