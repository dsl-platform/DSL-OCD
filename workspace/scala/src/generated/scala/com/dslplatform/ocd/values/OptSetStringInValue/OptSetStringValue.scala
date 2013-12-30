package com.dslplatform.ocd.values.OptSetStringInValue

import com.fasterxml.jackson.annotation._

case class OptSetStringValue @JsonIgnore() (
     optSetString: Option[Set[String]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetString") optSetString: Option[Set[String]]
  ) =
    this( optSetString = optSetString)

}
