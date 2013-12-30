package com.dslplatform.ocd.values.OneLongInValue

import com.fasterxml.jackson.annotation._

case class OneLongValue @JsonIgnore() (
     oneLong: Long = 0
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneLong") oneLong: Long
  ) =
    this( oneLong = if (oneLong == null) 0 else oneLong)

}
