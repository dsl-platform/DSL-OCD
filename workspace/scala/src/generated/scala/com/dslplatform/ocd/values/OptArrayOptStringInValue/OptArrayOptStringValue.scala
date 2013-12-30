package com.dslplatform.ocd.values.OptArrayOptStringInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptStringValue @JsonIgnore() (
     optArrayOptString: Option[Array[Option[String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptString") optArrayOptString: Option[Array[Option[String]]]
  ) =
    this( optArrayOptString = optArrayOptString)

}
