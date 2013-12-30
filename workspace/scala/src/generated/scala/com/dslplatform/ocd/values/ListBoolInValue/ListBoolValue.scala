package com.dslplatform.ocd.values.ListBoolInValue

import com.fasterxml.jackson.annotation._

case class ListBoolValue @JsonIgnore() (
     listBool: IndexedSeq[Boolean] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listBool") listBool: IndexedSeq[Boolean]
  ) =
    this( listBool = if (listBool == null) IndexedSeq.empty else listBool)

}
