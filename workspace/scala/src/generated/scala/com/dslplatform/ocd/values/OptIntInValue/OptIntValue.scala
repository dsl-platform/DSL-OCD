package com.dslplatform.ocd.values.OptIntInValue

import com.fasterxml.jackson.annotation._

case class OptIntValue @JsonIgnore() (
     optInt: Option[Int] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optInt") optInt: Option[Int]
  ) =
    this( optInt = optInt)

}
