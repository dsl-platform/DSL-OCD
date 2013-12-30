package com.dslplatform.ocd.values.OptListUUIDInValue

import com.fasterxml.jackson.annotation._

case class OptListUUIDValue @JsonIgnore() (
     optListUUID: Option[IndexedSeq[java.util.UUID]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListUUID") optListUUID: Option[IndexedSeq[java.util.UUID]]
  ) =
    this( optListUUID = optListUUID)

}
