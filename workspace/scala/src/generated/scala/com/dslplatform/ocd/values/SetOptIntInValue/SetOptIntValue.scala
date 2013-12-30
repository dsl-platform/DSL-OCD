package com.dslplatform.ocd.values.SetOptIntInValue

import com.fasterxml.jackson.annotation._

case class SetOptIntValue @JsonIgnore() (
     setOptInt: Set[Option[Int]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptInt") setOptInt: Set[Option[Int]]
  ) =
    this( setOptInt = if (setOptInt == null) Set.empty else setOptInt)

}
