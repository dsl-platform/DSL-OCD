package com.dslplatform.ocd.values.OneDoubleInValue

import com.fasterxml.jackson.annotation._

case class OneDoubleValue @JsonIgnore() (
     oneDouble: Double = 0
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneDouble") oneDouble: Double
  ) =
    this(oneDouble)

}
