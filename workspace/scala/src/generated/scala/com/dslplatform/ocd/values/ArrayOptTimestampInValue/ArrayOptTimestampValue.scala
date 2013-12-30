package com.dslplatform.ocd.values.ArrayOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptTimestampValue @JsonIgnore() (
     arrayOptTimestamp: Array[Option[org.joda.time.DateTime]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptTimestamp") arrayOptTimestamp: Array[Option[org.joda.time.DateTime]]
  ) =
    this( arrayOptTimestamp = if (arrayOptTimestamp == null) Array.empty else arrayOptTimestamp)

}
