package com.dslplatform.ocd.values.OptSetBoolInValue

import com.fasterxml.jackson.annotation._

case class OptSetBoolValue @JsonIgnore() (
     optSetBool: Option[Set[Boolean]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetBool") optSetBool: Option[Set[Boolean]]
  ) =
    this( optSetBool = optSetBool)

}
