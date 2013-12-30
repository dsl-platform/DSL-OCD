package com.dslplatform.ocd.values.ListLongInValue

import com.fasterxml.jackson.annotation._

case class ListLongValue @JsonIgnore() (
     listLong: IndexedSeq[Long] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listLong") listLong: IndexedSeq[Long]
  ) =
    this( listLong = if (listLong == null) IndexedSeq.empty else listLong)

}
