package com.dslplatform.ocd.values.ListMapInValue

import com.fasterxml.jackson.annotation._

case class ListMapValue @JsonIgnore() (
     listMap: IndexedSeq[Map[String, String]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listMap") listMap: IndexedSeq[Map[String, String]]
  ) =
    this( listMap = if (listMap == null) IndexedSeq.empty else listMap)

}
