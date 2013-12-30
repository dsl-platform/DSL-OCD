package com.dslplatform.ocd.values.OptListOptFloatInValue

import com.fasterxml.jackson.annotation._

case class OptListOptFloatValue @JsonIgnore() (
     optListOptFloat: Option[IndexedSeq[Option[Float]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptFloat") optListOptFloat: Option[IndexedSeq[Option[Float]]]
  ) =
    this( optListOptFloat = optListOptFloat)

}
