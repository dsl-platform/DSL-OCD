package com.dslplatform.ocd.values.OptArrayTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptArrayTimestampValue @JsonIgnore() (
     optArrayTimestamp: Option[Array[org.joda.time.DateTime]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayTimestamp") optArrayTimestamp: Option[Array[org.joda.time.DateTime]]
  ) =
    this( optArrayTimestamp = optArrayTimestamp)

}
