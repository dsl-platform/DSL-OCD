package com.dslplatform.ocd.values.ArrayBoolInValue

import com.fasterxml.jackson.annotation._

case class ArrayBoolValue @JsonIgnore() (
     arrayBool: Array[Boolean] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayBool") arrayBool: Array[Boolean]
  ) =
    this( arrayBool = if (arrayBool == null) Array.empty else arrayBool)

}
