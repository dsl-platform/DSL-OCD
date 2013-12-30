package com.dslplatform.ocd.values.ListOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class ListOptDoubleValue @JsonIgnore() (
     listOptDouble: IndexedSeq[Option[Double]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptDouble") listOptDouble: IndexedSeq[Option[Double]]
  ) =
    this( listOptDouble = if (listOptDouble == null) IndexedSeq.empty else listOptDouble)

}
