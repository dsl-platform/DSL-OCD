package com.dslplatform.ocd.values.SetOptBoolInValue

import com.fasterxml.jackson.annotation._

case class SetOptBoolValue @JsonIgnore() (
     setOptBool: Set[Option[Boolean]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptBool") setOptBool: Set[Option[Boolean]]
  ) =
    this( setOptBool = if (setOptBool == null) Set.empty else setOptBool)

}
