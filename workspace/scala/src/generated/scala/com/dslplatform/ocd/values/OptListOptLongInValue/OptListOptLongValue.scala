package com.dslplatform.ocd.values.OptListOptLongInValue

import com.fasterxml.jackson.annotation._

case class OptListOptLongValue @JsonIgnore() (
     optListOptLong: Option[IndexedSeq[Option[Long]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptLong") optListOptLong: Option[IndexedSeq[Option[Long]]]
  ) =
    this( optListOptLong = optListOptLong)

}
