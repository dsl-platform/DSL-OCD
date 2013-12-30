package com.dslplatform.ocd.values.ArrayDoubleInValue

import com.fasterxml.jackson.annotation._

case class ArrayDoubleValue @JsonIgnore() (
     arrayDouble: Array[Double] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayDouble") arrayDouble: Array[Double]
  ) =
    this( arrayDouble = if (arrayDouble == null) Array.empty else arrayDouble)

}
