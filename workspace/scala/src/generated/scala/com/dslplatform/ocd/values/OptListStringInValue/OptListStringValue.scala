package com.dslplatform.ocd.values.OptListStringInValue

import com.fasterxml.jackson.annotation._

case class OptListStringValue @JsonIgnore() (
     optListString: Option[IndexedSeq[String]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListString") optListString: Option[IndexedSeq[String]]
  ) =
    this( optListString = optListString)

}
