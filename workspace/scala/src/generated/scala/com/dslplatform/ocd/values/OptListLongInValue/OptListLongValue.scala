package com.dslplatform.ocd.values.OptListLongInValue

import com.fasterxml.jackson.annotation._

case class OptListLongValue @JsonIgnore() (
     optListLong: Option[IndexedSeq[Long]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListLong") optListLong: Option[IndexedSeq[Long]]
  ) =
    this( optListLong = optListLong)

}
