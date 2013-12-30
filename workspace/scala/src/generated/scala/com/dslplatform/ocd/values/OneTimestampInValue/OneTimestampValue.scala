package com.dslplatform.ocd.values.OneTimestampInValue

import com.fasterxml.jackson.annotation._

case class OneTimestampValue @JsonIgnore() (
     oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this( oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}
