package com.dslplatform.ocd.values.ArrayIntInValue

import com.fasterxml.jackson.annotation._

case class ArrayIntValue @JsonIgnore() (
     arrayInt: Array[Int] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayInt") arrayInt: Array[Int]
  ) =
    this( arrayInt = if (arrayInt == null) Array.empty else arrayInt)

}
