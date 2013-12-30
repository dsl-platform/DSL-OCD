package com.dslplatform.ocd.values.OptArrayOptFloatInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptFloatValue @JsonIgnore() (
     optArrayOptFloat: Option[Array[Option[Float]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptFloat") optArrayOptFloat: Option[Array[Option[Float]]]
  ) =
    this( optArrayOptFloat = optArrayOptFloat)

}
