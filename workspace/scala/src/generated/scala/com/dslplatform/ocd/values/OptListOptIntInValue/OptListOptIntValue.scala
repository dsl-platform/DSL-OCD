package com.dslplatform.ocd.values.OptListOptIntInValue

import com.fasterxml.jackson.annotation._

case class OptListOptIntValue @JsonIgnore() (
     optListOptInt: Option[IndexedSeq[Option[Int]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptInt") optListOptInt: Option[IndexedSeq[Option[Int]]]
  ) =
    this( optListOptInt = optListOptInt)

}
