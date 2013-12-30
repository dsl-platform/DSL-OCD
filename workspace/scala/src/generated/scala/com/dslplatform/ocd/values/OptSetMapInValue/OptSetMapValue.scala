package com.dslplatform.ocd.values.OptSetMapInValue

import com.fasterxml.jackson.annotation._

case class OptSetMapValue @JsonIgnore() (
     optSetMap: Option[Set[Map[String, String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetMap") optSetMap: Option[Set[Map[String, String]]]
  ) =
    this( optSetMap = optSetMap)

}
