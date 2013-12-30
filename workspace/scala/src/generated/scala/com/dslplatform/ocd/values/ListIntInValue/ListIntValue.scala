package com.dslplatform.ocd.values.ListIntInValue

import com.fasterxml.jackson.annotation._

case class ListIntValue @JsonIgnore() (
     listInt: IndexedSeq[Int] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listInt") listInt: IndexedSeq[Int]
  ) =
    this( listInt = if (listInt == null) IndexedSeq.empty else listInt)

}
