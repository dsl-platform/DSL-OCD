package com.dslplatform.ocd.values.OptListDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptListDoubleValue @JsonIgnore() (
     optListDouble: Option[IndexedSeq[Double]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListDouble") optListDouble: Option[IndexedSeq[Double]]
  ) =
    this( optListDouble = optListDouble)

}
