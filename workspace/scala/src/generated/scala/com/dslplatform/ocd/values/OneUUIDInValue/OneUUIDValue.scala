package com.dslplatform.ocd.values.OneUUIDInValue

import com.fasterxml.jackson.annotation._

case class OneUUIDValue @JsonIgnore() (
     oneUUID: java.util.UUID = java.util.UUID.randomUUID
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneUUID") oneUUID: java.util.UUID
  ) =
    this( oneUUID = if (oneUUID == null) java.util.UUID.randomUUID else oneUUID)

}
