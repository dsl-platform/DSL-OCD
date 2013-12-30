package com.dslplatform.ocd.values.ListOptBoolInValue

import com.fasterxml.jackson.annotation._

case class ListOptBoolValue @JsonIgnore() (
     listOptBool: IndexedSeq[Option[Boolean]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptBool") listOptBool: IndexedSeq[Option[Boolean]]
  ) =
    this( listOptBool = if (listOptBool == null) IndexedSeq.empty else listOptBool)

}
