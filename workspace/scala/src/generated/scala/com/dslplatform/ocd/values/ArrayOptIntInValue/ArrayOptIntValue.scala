package com.dslplatform.ocd.values.ArrayOptIntInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptIntValue @JsonIgnore() (
     arrayOptInt: Array[Option[Int]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptInt") arrayOptInt: Array[Option[Int]]
  ) =
    this( arrayOptInt = if (arrayOptInt == null) Array.empty else arrayOptInt)

}
