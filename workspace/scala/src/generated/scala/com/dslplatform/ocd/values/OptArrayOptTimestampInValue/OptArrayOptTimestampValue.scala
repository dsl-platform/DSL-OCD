package com.dslplatform.ocd.values.OptArrayOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptTimestampValue @JsonIgnore() (
     optArrayOptTimestamp: Option[Array[Option[org.joda.time.DateTime]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptTimestamp") optArrayOptTimestamp: Option[Array[Option[org.joda.time.DateTime]]]
  ) =
    this( optArrayOptTimestamp = optArrayOptTimestamp)

}
