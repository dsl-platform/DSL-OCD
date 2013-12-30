package com.dslplatform.ocd.values.SetOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class SetOptTimestampValue @JsonIgnore() (
     setOptTimestamp: Set[Option[org.joda.time.DateTime]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptTimestamp") setOptTimestamp: Set[Option[org.joda.time.DateTime]]
  ) =
    this( setOptTimestamp = if (setOptTimestamp == null) Set.empty else setOptTimestamp)

}
