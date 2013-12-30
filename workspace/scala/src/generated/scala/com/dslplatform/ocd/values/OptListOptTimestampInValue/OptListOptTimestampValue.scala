package com.dslplatform.ocd.values.OptListOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptListOptTimestampValue @JsonIgnore() (
     optListOptTimestamp: Option[IndexedSeq[Option[org.joda.time.DateTime]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptTimestamp") optListOptTimestamp: Option[IndexedSeq[Option[org.joda.time.DateTime]]]
  ) =
    this( optListOptTimestamp = optListOptTimestamp)

}
