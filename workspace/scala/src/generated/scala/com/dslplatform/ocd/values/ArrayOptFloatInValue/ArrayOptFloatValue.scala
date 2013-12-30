package com.dslplatform.ocd.values.ArrayOptFloatInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptFloatValue @JsonIgnore() (
     arrayOptFloat: Array[Option[Float]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptFloat") arrayOptFloat: Array[Option[Float]]
  ) =
    this( arrayOptFloat = if (arrayOptFloat == null) Array.empty else arrayOptFloat)

}
