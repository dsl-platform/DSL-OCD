package com.dslplatform.ocd.values.OneFloatInValue

import com.fasterxml.jackson.annotation._

case class OneFloatValue @JsonIgnore() (
     oneFloat: Float = 0.0f
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneFloat") oneFloat: Float
  ) =
    this(oneFloat)

}
