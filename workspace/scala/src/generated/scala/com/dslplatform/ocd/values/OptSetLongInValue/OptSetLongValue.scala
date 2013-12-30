package com.dslplatform.ocd.values.OptSetLongInValue

import com.fasterxml.jackson.annotation._

case class OptSetLongValue @JsonIgnore() (
     optSetLong: Option[Set[Long]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetLong") optSetLong: Option[Set[Long]]
  ) =
    this( optSetLong = optSetLong)

}
