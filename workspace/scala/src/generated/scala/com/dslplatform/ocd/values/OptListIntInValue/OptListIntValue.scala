package com.dslplatform.ocd.values.OptListIntInValue

import com.fasterxml.jackson.annotation._

case class OptListIntValue @JsonIgnore() (
     optListInt: Option[IndexedSeq[Int]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListInt") optListInt: Option[IndexedSeq[Int]]
  ) =
    this( optListInt = optListInt)

}
