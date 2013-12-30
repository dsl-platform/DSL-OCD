package com.dslplatform.ocd.values.OptListOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptListOptUUIDValue @JsonIgnore() (
     optListOptUUID: Option[IndexedSeq[Option[java.util.UUID]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptUUID") optListOptUUID: Option[IndexedSeq[Option[java.util.UUID]]]
  ) =
    this( optListOptUUID = optListOptUUID)

}
