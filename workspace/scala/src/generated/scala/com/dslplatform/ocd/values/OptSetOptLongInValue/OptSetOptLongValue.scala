package com.dslplatform.ocd.values.OptSetOptLongInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptLongValue @JsonIgnore() (
     optSetOptLong: Option[Set[Option[Long]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptLong") optSetOptLong: Option[Set[Option[Long]]]
  ) =
    this( optSetOptLong = optSetOptLong)

}
