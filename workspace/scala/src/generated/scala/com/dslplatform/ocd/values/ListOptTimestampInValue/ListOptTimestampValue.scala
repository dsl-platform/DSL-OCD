package com.dslplatform.ocd.values.ListOptTimestampInValue

import com.fasterxml.jackson.annotation._

case class ListOptTimestampValue @JsonIgnore() (
     listOptTimestamp: IndexedSeq[Option[org.joda.time.DateTime]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptTimestamp") listOptTimestamp: IndexedSeq[Option[org.joda.time.DateTime]]
  ) =
    this( listOptTimestamp = if (listOptTimestamp == null) IndexedSeq.empty else listOptTimestamp)

}
