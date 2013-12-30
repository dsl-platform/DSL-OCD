package com.dslplatform.ocd.values.OptSetOptStringInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptStringValue @JsonIgnore() (
     optSetOptString: Option[Set[Option[String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptString") optSetOptString: Option[Set[Option[String]]]
  ) =
    this( optSetOptString = optSetOptString)

}
