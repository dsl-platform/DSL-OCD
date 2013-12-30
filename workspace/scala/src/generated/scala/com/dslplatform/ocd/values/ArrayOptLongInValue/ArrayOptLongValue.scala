package com.dslplatform.ocd.values.ArrayOptLongInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptLongValue @JsonIgnore() (
     arrayOptLong: Array[Option[Long]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptLong") arrayOptLong: Array[Option[Long]]
  ) =
    this( arrayOptLong = if (arrayOptLong == null) Array.empty else arrayOptLong)

}
