package com.dslplatform.ocd.values.OptListOptMapInValue

import com.fasterxml.jackson.annotation._

case class OptListOptMapValue @JsonIgnore() (
     optListOptMap: Option[IndexedSeq[Option[Map[String, String]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptMap") optListOptMap: Option[IndexedSeq[Option[Map[String, String]]]]
  ) =
    this( optListOptMap = optListOptMap)

}
