package com.dslplatform.ocd.values.OptArrayOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptUUIDValue @JsonIgnore() (
     optArrayOptUUID: Option[Array[Option[java.util.UUID]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptUUID") optArrayOptUUID: Option[Array[Option[java.util.UUID]]]
  ) =
    this( optArrayOptUUID = optArrayOptUUID)

}
