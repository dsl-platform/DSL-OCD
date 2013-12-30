package com.dslplatform.ocd.values.OptSetOptBoolInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptBoolValue @JsonIgnore() (
     optSetOptBool: Option[Set[Option[Boolean]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptBool") optSetOptBool: Option[Set[Option[Boolean]]]
  ) =
    this( optSetOptBool = optSetOptBool)

}
