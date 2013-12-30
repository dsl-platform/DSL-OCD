package com.dslplatform.ocd.values.OptArrayOptIntInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptIntValue @JsonIgnore() (
     optArrayOptInt: Option[Array[Option[Int]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptInt") optArrayOptInt: Option[Array[Option[Int]]]
  ) =
    this( optArrayOptInt = optArrayOptInt)

}
