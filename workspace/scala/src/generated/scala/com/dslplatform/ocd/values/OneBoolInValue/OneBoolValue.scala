package com.dslplatform.ocd.values.OneBoolInValue

import com.fasterxml.jackson.annotation._

case class OneBoolValue @JsonIgnore() (
     oneBool: Boolean = false
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneBool") oneBool: Boolean
  ) =
    this( oneBool = if (oneBool == null) false else oneBool)

}
