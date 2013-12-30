package com.dslplatform.ocd.values.ListOptFloatInValue

import com.fasterxml.jackson.annotation._

case class ListOptFloatValue @JsonIgnore() (
     listOptFloat: IndexedSeq[Option[Float]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptFloat") listOptFloat: IndexedSeq[Option[Float]]
  ) =
    this( listOptFloat = if (listOptFloat == null) IndexedSeq.empty else listOptFloat)

}
