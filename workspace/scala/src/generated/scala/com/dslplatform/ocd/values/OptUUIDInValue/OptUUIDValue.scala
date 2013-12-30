package com.dslplatform.ocd.values.OptUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptUUIDValue @JsonIgnore() (
     optUUID: Option[java.util.UUID] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optUUID") optUUID: Option[java.util.UUID]
  ) =
    this( optUUID = optUUID)

}
