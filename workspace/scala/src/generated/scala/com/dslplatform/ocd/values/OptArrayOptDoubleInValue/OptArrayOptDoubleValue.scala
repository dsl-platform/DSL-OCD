package com.dslplatform.ocd.values.OptArrayOptDoubleInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptDoubleValue @JsonIgnore() (
     optArrayOptDouble: Option[Array[Option[Double]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptDouble") optArrayOptDouble: Option[Array[Option[Double]]]
  ) =
    this( optArrayOptDouble = optArrayOptDouble)

}
