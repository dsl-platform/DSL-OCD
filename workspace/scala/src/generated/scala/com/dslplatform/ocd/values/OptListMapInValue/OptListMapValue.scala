package com.dslplatform.ocd.values.OptListMapInValue

import com.fasterxml.jackson.annotation._

case class OptListMapValue @JsonIgnore() (
     optListMap: Option[IndexedSeq[Map[String, String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListMap") optListMap: Option[IndexedSeq[Map[String, String]]]
  ) =
    this( optListMap = optListMap)

}
