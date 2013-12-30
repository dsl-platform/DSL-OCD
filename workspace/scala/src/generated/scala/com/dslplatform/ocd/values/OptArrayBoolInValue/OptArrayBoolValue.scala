package com.dslplatform.ocd.values.OptArrayBoolInValue

import com.fasterxml.jackson.annotation._

case class OptArrayBoolValue @JsonIgnore() (
     optArrayBool: Option[Array[Boolean]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayBool") optArrayBool: Option[Array[Boolean]]
  ) =
    this( optArrayBool = optArrayBool)

}
