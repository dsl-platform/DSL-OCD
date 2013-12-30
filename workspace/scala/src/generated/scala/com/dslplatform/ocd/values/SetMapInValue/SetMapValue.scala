package com.dslplatform.ocd.values.SetMapInValue

import com.fasterxml.jackson.annotation._

case class SetMapValue @JsonIgnore() (
     setMap: Set[Map[String, String]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setMap") setMap: Set[Map[String, String]]
  ) =
    this( setMap = if (setMap == null) Set.empty else setMap)

}
