package com.dslplatform.ocd.values.OneMapInValue

import com.fasterxml.jackson.annotation._

case class OneMapValue @JsonIgnore() (
     oneMap: Map[String, String] = Map.empty[String, String]
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneMap") oneMap: Map[String, String]
  ) =
    this( oneMap = if (oneMap == null) Map.empty[String, String] else oneMap)

}
