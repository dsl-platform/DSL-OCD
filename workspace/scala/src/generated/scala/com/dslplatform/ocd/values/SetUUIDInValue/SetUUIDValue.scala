package com.dslplatform.ocd.values.SetUUIDInValue

import com.fasterxml.jackson.annotation._

case class SetUUIDValue @JsonIgnore() (
     setUUID: Set[java.util.UUID] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setUUID") setUUID: Set[java.util.UUID]
  ) =
    this( setUUID = if (setUUID == null) Set.empty else setUUID)

}
