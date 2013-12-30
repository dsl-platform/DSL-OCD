package com.dslplatform.ocd.values.SetOptFloatInValue

import com.fasterxml.jackson.annotation._

case class SetOptFloatValue @JsonIgnore() (
     setOptFloat: Set[Option[Float]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptFloat") setOptFloat: Set[Option[Float]]
  ) =
    this( setOptFloat = if (setOptFloat == null) Set.empty else setOptFloat)

}
