package com.dslplatform.ocd.values.ListOptIntInValue

import com.fasterxml.jackson.annotation._

case class ListOptIntValue @JsonIgnore() (
     listOptInt: IndexedSeq[Option[Int]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptInt") listOptInt: IndexedSeq[Option[Int]]
  ) =
    this( listOptInt = if (listOptInt == null) IndexedSeq.empty else listOptInt)

}
