package com.dslplatform.ocd.values.OptListOptStringInValue

import com.fasterxml.jackson.annotation._

case class OptListOptStringValue @JsonIgnore() (
     optListOptString: Option[IndexedSeq[Option[String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptString") optListOptString: Option[IndexedSeq[Option[String]]]
  ) =
    this( optListOptString = optListOptString)

}
