package com.dslplatform.ocd.values.SetOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class SetOptUUIDValue @JsonIgnore() (
     setOptUUID: Set[Option[java.util.UUID]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptUUID") setOptUUID: Set[Option[java.util.UUID]]
  ) =
    this( setOptUUID = if (setOptUUID == null) Set.empty else setOptUUID)

}
