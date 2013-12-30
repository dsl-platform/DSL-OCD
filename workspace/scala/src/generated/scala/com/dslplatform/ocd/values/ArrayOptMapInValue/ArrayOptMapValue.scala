package com.dslplatform.ocd.values.ArrayOptMapInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptMapValue @JsonIgnore() (
     arrayOptMap: Array[Option[Map[String, String]]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptMap") arrayOptMap: Array[Option[Map[String, String]]]
  ) =
    this( arrayOptMap = if (arrayOptMap == null) Array.empty else arrayOptMap)

}
