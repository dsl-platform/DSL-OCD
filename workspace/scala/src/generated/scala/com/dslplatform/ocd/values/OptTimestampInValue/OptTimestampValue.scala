package com.dslplatform.ocd.values.OptTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptTimestampValue @JsonIgnore() (
     optTimestamp: Option[org.joda.time.DateTime] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optTimestamp") optTimestamp: Option[org.joda.time.DateTime]
  ) =
    this( optTimestamp = optTimestamp)

}
