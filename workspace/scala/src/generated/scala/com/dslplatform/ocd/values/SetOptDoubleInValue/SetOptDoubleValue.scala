package com.dslplatform.ocd.values.SetOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class SetOptDoubleValue @JsonIgnore() (
     setOptDouble: Set[Option[Double]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptDouble") setOptDouble: Set[Option[Double]]
  ) =
    this( setOptDouble = if (setOptDouble == null) Set.empty else setOptDouble)

}
