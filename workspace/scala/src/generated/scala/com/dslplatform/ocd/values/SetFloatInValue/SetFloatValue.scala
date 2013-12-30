package com.dslplatform.ocd.values.SetFloatInValue

import com.fasterxml.jackson.annotation._

case class SetFloatValue @JsonIgnore() (
     setFloat: Set[Float] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setFloat") setFloat: Set[Float]
  ) =
    this( setFloat = if (setFloat == null) Set.empty else setFloat)

}
