package com.dslplatform.ocd.values.OptListFloatInValue

import com.fasterxml.jackson.annotation._

case class OptListFloatValue @JsonIgnore() (
     optListFloat: Option[IndexedSeq[Float]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListFloat") optListFloat: Option[IndexedSeq[Float]]
  ) =
    this( optListFloat = optListFloat)

}
