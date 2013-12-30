package com.dslplatform.ocd.values.ListDoubleInValue

import com.fasterxml.jackson.annotation._

case class ListDoubleValue @JsonIgnore() (
     listDouble: IndexedSeq[Double] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listDouble") listDouble: IndexedSeq[Double]
  ) =
    this( listDouble = if (listDouble == null) IndexedSeq.empty else listDouble)

}
