package com.dslplatform.ocd.values.OneIntInValue

import com.fasterxml.jackson.annotation._

case class OneIntValue @JsonIgnore() (
     oneInt: Int = 0
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneInt") oneInt: Int
  ) =
    this(oneInt)

}
