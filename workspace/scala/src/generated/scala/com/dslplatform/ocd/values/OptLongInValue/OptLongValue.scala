package com.dslplatform.ocd.values.OptLongInValue

import com.fasterxml.jackson.annotation._

case class OptLongValue @JsonIgnore() (
     optLong: Option[Long] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optLong") optLong: Option[Long]
  ) =
    this( optLong = optLong)

}
