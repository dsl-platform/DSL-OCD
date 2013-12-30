package com.dslplatform.ocd.values.OptStringInValue

import com.fasterxml.jackson.annotation._

case class OptStringValue @JsonIgnore() (
     optString: Option[String] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optString") optString: Option[String]
  ) =
    this( optString = optString)

}
