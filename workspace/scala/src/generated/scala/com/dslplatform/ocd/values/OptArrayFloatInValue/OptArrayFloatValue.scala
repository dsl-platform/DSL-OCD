package com.dslplatform.ocd.values.OptArrayFloatInValue

import com.fasterxml.jackson.annotation._

case class OptArrayFloatValue @JsonIgnore() (
     optArrayFloat: Option[Array[Float]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayFloat") optArrayFloat: Option[Array[Float]]
  ) =
    this( optArrayFloat = optArrayFloat)

}
