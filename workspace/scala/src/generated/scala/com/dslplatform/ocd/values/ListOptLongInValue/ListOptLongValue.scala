package com.dslplatform.ocd.values.ListOptLongInValue

import com.fasterxml.jackson.annotation._

case class ListOptLongValue @JsonIgnore() (
     listOptLong: IndexedSeq[Option[Long]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptLong") listOptLong: IndexedSeq[Option[Long]]
  ) =
    this( listOptLong = if (listOptLong == null) IndexedSeq.empty else listOptLong)

}
