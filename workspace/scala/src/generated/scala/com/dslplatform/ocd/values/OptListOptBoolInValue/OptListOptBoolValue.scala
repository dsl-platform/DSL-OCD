package com.dslplatform.ocd.values.OptListOptBoolInValue

import com.fasterxml.jackson.annotation._

case class OptListOptBoolValue @JsonIgnore() (
     optListOptBool: Option[IndexedSeq[Option[Boolean]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptBool") optListOptBool: Option[IndexedSeq[Option[Boolean]]]
  ) =
    this( optListOptBool = optListOptBool)

}
