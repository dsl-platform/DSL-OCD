package com.dslplatform.ocd.values.OptSetUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptSetUUIDValue @JsonIgnore() (
     optSetUUID: Option[Set[java.util.UUID]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetUUID") optSetUUID: Option[Set[java.util.UUID]]
  ) =
    this( optSetUUID = optSetUUID)

}
