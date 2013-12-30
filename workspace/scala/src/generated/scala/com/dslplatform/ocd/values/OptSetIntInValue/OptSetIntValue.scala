package com.dslplatform.ocd.values.OptSetIntInValue

import com.fasterxml.jackson.annotation._

case class OptSetIntValue @JsonIgnore() (
     optSetInt: Option[Set[Int]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetInt") optSetInt: Option[Set[Int]]
  ) =
    this( optSetInt = optSetInt)

}
