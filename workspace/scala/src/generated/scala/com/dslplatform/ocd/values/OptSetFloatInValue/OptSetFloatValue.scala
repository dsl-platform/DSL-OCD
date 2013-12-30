package com.dslplatform.ocd.values.OptSetFloatInValue

import com.fasterxml.jackson.annotation._

case class OptSetFloatValue @JsonIgnore() (
     optSetFloat: Option[Set[Float]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetFloat") optSetFloat: Option[Set[Float]]
  ) =
    this( optSetFloat = optSetFloat)

}
