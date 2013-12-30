package com.dslplatform.ocd.values.OptBoolInValue

import com.fasterxml.jackson.annotation._

case class OptBoolValue @JsonIgnore() (
     optBool: Option[Boolean] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optBool") optBool: Option[Boolean]
  ) =
    this( optBool = optBool)

}
