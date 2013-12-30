package com.dslplatform.ocd.values.OptArrayOptBoolInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptBoolValue @JsonIgnore() (
     optArrayOptBool: Option[Array[Option[Boolean]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptBool") optArrayOptBool: Option[Array[Option[Boolean]]]
  ) =
    this( optArrayOptBool = optArrayOptBool)

}
