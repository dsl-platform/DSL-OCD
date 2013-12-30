package com.dslplatform.ocd.values.OptArrayUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptArrayUUIDValue @JsonIgnore() (
     optArrayUUID: Option[Array[java.util.UUID]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayUUID") optArrayUUID: Option[Array[java.util.UUID]]
  ) =
    this( optArrayUUID = optArrayUUID)

}
