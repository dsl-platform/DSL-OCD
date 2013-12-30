package com.dslplatform.ocd.values.OptSetOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptTimestampValue @JsonIgnore() (
     optSetOptTimestamp: Option[Set[Option[org.joda.time.DateTime]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptTimestamp") optSetOptTimestamp: Option[Set[Option[org.joda.time.DateTime]]]
  ) =
    this( optSetOptTimestamp = optSetOptTimestamp)

}
