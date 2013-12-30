package com.dslplatform.ocd.values.ArrayFloatInValue

import com.fasterxml.jackson.annotation._

case class ArrayFloatValue @JsonIgnore() (
     arrayFloat: Array[Float] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayFloat") arrayFloat: Array[Float]
  ) =
    this( arrayFloat = if (arrayFloat == null) Array.empty else arrayFloat)

}
