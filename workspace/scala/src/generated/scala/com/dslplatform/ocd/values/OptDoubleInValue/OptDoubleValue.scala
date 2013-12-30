package com.dslplatform.ocd.values.OptDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptDoubleValue @JsonIgnore() (
     optDouble: Option[Double] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optDouble") optDouble: Option[Double]
  ) =
    this( optDouble = optDouble)

}
