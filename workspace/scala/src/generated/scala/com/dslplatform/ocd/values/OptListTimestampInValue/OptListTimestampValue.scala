package com.dslplatform.ocd.values.OptListTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptListTimestampValue @JsonIgnore() (
     optListTimestamp: Option[IndexedSeq[org.joda.time.DateTime]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListTimestamp") optListTimestamp: Option[IndexedSeq[org.joda.time.DateTime]]
  ) =
    this( optListTimestamp = optListTimestamp)

}
