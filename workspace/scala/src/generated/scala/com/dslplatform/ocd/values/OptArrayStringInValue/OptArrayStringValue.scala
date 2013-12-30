package com.dslplatform.ocd.values.OptArrayStringInValue

import com.fasterxml.jackson.annotation._

case class OptArrayStringValue @JsonIgnore() (
     optArrayString: Option[Array[String]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayString") optArrayString: Option[Array[String]]
  ) =
    this( optArrayString = optArrayString)

}
