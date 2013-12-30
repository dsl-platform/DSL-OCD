package com.dslplatform.ocd.values.OptSetOptIntInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptIntValue @JsonIgnore() (
     optSetOptInt: Option[Set[Option[Int]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptInt") optSetOptInt: Option[Set[Option[Int]]]
  ) =
    this( optSetOptInt = optSetOptInt)

}
