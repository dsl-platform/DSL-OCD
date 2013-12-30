package com.dslplatform.ocd.values.ListUUIDInValue

import com.fasterxml.jackson.annotation._

case class ListUUIDValue @JsonIgnore() (
     listUUID: IndexedSeq[java.util.UUID] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listUUID") listUUID: IndexedSeq[java.util.UUID]
  ) =
    this( listUUID = if (listUUID == null) IndexedSeq.empty else listUUID)

}
