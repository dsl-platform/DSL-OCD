package com.dslplatform.ocd.values.SetIntInValue

import com.fasterxml.jackson.annotation._

case class SetIntValue @JsonIgnore() (
     setInt: Set[Int] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setInt") setInt: Set[Int]
  ) =
    this( setInt = if (setInt == null) Set.empty else setInt)

}
