package com.dslplatform.ocd.values.ArrayOptBoolInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptBoolValue @JsonIgnore() (
     arrayOptBool: Array[Option[Boolean]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptBool") arrayOptBool: Array[Option[Boolean]]
  ) =
    this( arrayOptBool = if (arrayOptBool == null) Array.empty else arrayOptBool)

}
