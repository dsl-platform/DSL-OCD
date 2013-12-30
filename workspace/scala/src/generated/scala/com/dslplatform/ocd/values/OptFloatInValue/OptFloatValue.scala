package com.dslplatform.ocd.values.OptFloatInValue

import com.fasterxml.jackson.annotation._

case class OptFloatValue @JsonIgnore() (
     optFloat: Option[Float] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optFloat") optFloat: Option[Float]
  ) =
    this( optFloat = optFloat)

}
