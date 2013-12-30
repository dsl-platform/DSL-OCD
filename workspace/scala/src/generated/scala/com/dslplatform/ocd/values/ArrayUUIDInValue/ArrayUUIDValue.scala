package com.dslplatform.ocd.values.ArrayUUIDInValue

import com.fasterxml.jackson.annotation._

case class ArrayUUIDValue @JsonIgnore() (
     arrayUUID: Array[java.util.UUID] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayUUID") arrayUUID: Array[java.util.UUID]
  ) =
    this( arrayUUID = if (arrayUUID == null) Array.empty else arrayUUID)

}
