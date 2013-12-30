package com.dslplatform.ocd.values.ListOptMapInValue

import com.fasterxml.jackson.annotation._

case class ListOptMapValue @JsonIgnore() (
     listOptMap: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptMap") listOptMap: IndexedSeq[Option[Map[String, String]]]
  ) =
    this( listOptMap = if (listOptMap == null) IndexedSeq.empty else listOptMap)

}
