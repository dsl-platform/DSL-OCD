package com.dslplatform.ocd.values.ArrayLongInValue

import com.fasterxml.jackson.annotation._

case class ArrayLongValue @JsonIgnore() (
     arrayLong: Array[Long] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayLong") arrayLong: Array[Long]
  ) =
    this( arrayLong = if (arrayLong == null) Array.empty else arrayLong)

}
