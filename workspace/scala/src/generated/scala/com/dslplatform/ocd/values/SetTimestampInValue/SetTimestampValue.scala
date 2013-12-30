package com.dslplatform.ocd.values.SetTimestampInValue

import com.fasterxml.jackson.annotation._

case class SetTimestampValue @JsonIgnore() (
     setTimestamp: Set[org.joda.time.DateTime] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setTimestamp") setTimestamp: Set[org.joda.time.DateTime]
  ) =
    this( setTimestamp = if (setTimestamp == null) Set.empty else setTimestamp)

}
