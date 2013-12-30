package com.dslplatform.ocd.values.ListBinaryInValue

import com.fasterxml.jackson.annotation._

case class ListBinaryValue @JsonIgnore() (
     listBinary: IndexedSeq[Array[Byte]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listBinary") listBinary: IndexedSeq[Array[Byte]]
  ) =
    this( listBinary = if (listBinary == null) IndexedSeq.empty else listBinary)

}
