package com.dslplatform.ocd.values.OptListBoolInValue

import com.fasterxml.jackson.annotation._

case class OptListBoolValue @JsonIgnore() (
     optListBool: Option[IndexedSeq[Boolean]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListBool") optListBool: Option[IndexedSeq[Boolean]]
  ) =
    this( optListBool = optListBool)

}
