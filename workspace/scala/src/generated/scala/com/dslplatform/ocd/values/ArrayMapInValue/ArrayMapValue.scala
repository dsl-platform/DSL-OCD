package com.dslplatform.ocd.values.ArrayMapInValue

import com.fasterxml.jackson.annotation._

case class ArrayMapValue @JsonIgnore() (
     arrayMap: Array[Map[String, String]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayMap") arrayMap: Array[Map[String, String]]
  ) =
    this( arrayMap = if (arrayMap == null) Array.empty else arrayMap)

}
