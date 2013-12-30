package com.dslplatform.ocd.values.OptSetOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptUUIDValue @JsonIgnore() (
     optSetOptUUID: Option[Set[Option[java.util.UUID]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptUUID") optSetOptUUID: Option[Set[Option[java.util.UUID]]]
  ) =
    this( optSetOptUUID = optSetOptUUID)

}
