package com.dslplatform.ocd.values.ListOptBinaryInValue

import com.fasterxml.jackson.annotation._

case class ListOptBinaryValue @JsonIgnore() (
     listOptBinary: IndexedSeq[Option[Array[Byte]]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptBinary") listOptBinary: IndexedSeq[Option[Array[Byte]]]
  ) =
    this( listOptBinary = if (listOptBinary == null) IndexedSeq.empty else listOptBinary)

}
