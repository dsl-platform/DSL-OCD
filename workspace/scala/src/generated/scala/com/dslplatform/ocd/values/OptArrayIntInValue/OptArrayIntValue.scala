package com.dslplatform.ocd.values.OptArrayIntInValue

import com.fasterxml.jackson.annotation._

case class OptArrayIntValue @JsonIgnore() (
     optArrayInt: Option[Array[Int]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayInt") optArrayInt: Option[Array[Int]]
  ) =
    this( optArrayInt = optArrayInt)

}
