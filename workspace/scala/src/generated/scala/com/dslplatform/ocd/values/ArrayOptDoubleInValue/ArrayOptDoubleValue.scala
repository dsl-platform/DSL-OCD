package com.dslplatform.ocd.values.ArrayOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptDoubleValue @JsonIgnore() (
     arrayOptDouble: Array[Option[Double]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptDouble") arrayOptDouble: Array[Option[Double]]
  ) =
    this( arrayOptDouble = if (arrayOptDouble == null) Array.empty else arrayOptDouble)

}
