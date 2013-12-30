package com.dslplatform.ocd.values.ArrayStringInValue

import com.fasterxml.jackson.annotation._

case class ArrayStringValue @JsonIgnore() (
     arrayString: Array[String] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayString") arrayString: Array[String]
  ) =
    this( arrayString = if (arrayString == null) Array.empty else arrayString)

}
