package com.dslplatform.ocd.values.ListOptUUIDInValue

import com.fasterxml.jackson.annotation._

case class ListOptUUIDValue @JsonIgnore() (
     listOptUUID: IndexedSeq[Option[java.util.UUID]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptUUID") listOptUUID: IndexedSeq[Option[java.util.UUID]]
  ) =
    this( listOptUUID = if (listOptUUID == null) IndexedSeq.empty else listOptUUID)

}
