package com.dslplatform.ocd.values.SetBoolInValue

import com.fasterxml.jackson.annotation._

case class SetBoolValue @JsonIgnore() (
     setBool: Set[Boolean] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setBool") setBool: Set[Boolean]
  ) =
    this( setBool = if (setBool == null) Set.empty else setBool)

}
