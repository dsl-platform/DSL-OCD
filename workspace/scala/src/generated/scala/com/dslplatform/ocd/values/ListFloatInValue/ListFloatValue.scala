package com.dslplatform.ocd.values.ListFloatInValue

import com.fasterxml.jackson.annotation._

case class ListFloatValue @JsonIgnore() (
     listFloat: IndexedSeq[Float] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listFloat") listFloat: IndexedSeq[Float]
  ) =
    this( listFloat = if (listFloat == null) IndexedSeq.empty else listFloat)

}
