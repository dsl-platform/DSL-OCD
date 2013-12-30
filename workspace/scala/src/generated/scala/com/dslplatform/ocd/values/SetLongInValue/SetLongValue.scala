package com.dslplatform.ocd.values.SetLongInValue

import com.fasterxml.jackson.annotation._

case class SetLongValue @JsonIgnore() (
     setLong: Set[Long] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setLong") setLong: Set[Long]
  ) =
    this( setLong = if (setLong == null) Set.empty else setLong)

}
