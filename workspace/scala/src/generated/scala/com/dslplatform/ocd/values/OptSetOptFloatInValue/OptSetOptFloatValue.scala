package com.dslplatform.ocd.values.OptSetOptFloatInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptFloatValue @JsonIgnore() (
     optSetOptFloat: Option[Set[Option[Float]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptFloat") optSetOptFloat: Option[Set[Option[Float]]]
  ) =
    this( optSetOptFloat = optSetOptFloat)

}
