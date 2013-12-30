package com.dslplatform.ocd.values.SetOptMapInValue

import com.fasterxml.jackson.annotation._

case class SetOptMapValue @JsonIgnore() (
     setOptMap: Set[Option[Map[String, String]]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptMap") setOptMap: Set[Option[Map[String, String]]]
  ) =
    this( setOptMap = if (setOptMap == null) Set.empty else setOptMap)

}
