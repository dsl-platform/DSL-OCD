package com.dslplatform.ocd.values.SetBinaryInValue

import com.fasterxml.jackson.annotation._

case class SetBinaryValue @JsonIgnore() (
     setBinary: Set[Array[Byte]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setBinary") setBinary: Set[Array[Byte]]
  ) =
    this( setBinary = if (setBinary == null) Set.empty else setBinary)

}
