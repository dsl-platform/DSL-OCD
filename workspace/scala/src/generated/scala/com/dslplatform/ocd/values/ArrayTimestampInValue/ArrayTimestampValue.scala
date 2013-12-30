package com.dslplatform.ocd.values.ArrayTimestampInValue

import com.fasterxml.jackson.annotation._

case class ArrayTimestampValue @JsonIgnore() (
     arrayTimestamp: Array[org.joda.time.DateTime] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayTimestamp") arrayTimestamp: Array[org.joda.time.DateTime]
  ) =
    this( arrayTimestamp = if (arrayTimestamp == null) Array.empty else arrayTimestamp)

}
