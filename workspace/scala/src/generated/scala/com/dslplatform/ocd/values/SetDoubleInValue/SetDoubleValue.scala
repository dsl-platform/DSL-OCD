package com.dslplatform.ocd.values.SetDoubleInValue

import com.fasterxml.jackson.annotation._

case class SetDoubleValue @JsonIgnore() (
     setDouble: Set[Double] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setDouble") setDouble: Set[Double]
  ) =
    this( setDouble = if (setDouble == null) Set.empty else setDouble)

}
