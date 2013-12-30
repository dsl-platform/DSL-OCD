package com.dslplatform.ocd.values.ListTimestampInValue

import com.fasterxml.jackson.annotation._

case class ListTimestampValue @JsonIgnore() (
     listTimestamp: IndexedSeq[org.joda.time.DateTime] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listTimestamp") listTimestamp: IndexedSeq[org.joda.time.DateTime]
  ) =
    this( listTimestamp = if (listTimestamp == null) IndexedSeq.empty else listTimestamp)

}
