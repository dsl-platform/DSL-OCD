package com.dslplatform.ocd.values.ArrayOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptUUIDValue @JsonIgnore() (
     arrayOptUUID: Array[Option[java.util.UUID]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptUUID") arrayOptUUID: Array[Option[java.util.UUID]]
  ) =
    this( arrayOptUUID = if (arrayOptUUID == null) Array.empty else arrayOptUUID)

}
