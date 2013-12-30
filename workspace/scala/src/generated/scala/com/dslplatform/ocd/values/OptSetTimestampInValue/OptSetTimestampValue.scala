package com.dslplatform.ocd.values.OptSetTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptSetTimestampValue @JsonIgnore() (
     optSetTimestamp: Option[Set[org.joda.time.DateTime]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetTimestamp") optSetTimestamp: Option[Set[org.joda.time.DateTime]]
  ) =
    this( optSetTimestamp = optSetTimestamp)

}
