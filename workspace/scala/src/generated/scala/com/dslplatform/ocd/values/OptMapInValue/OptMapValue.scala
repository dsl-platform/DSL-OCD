package com.dslplatform.ocd.values.OptMapInValue

import com.fasterxml.jackson.annotation._

case class OptMapValue @JsonIgnore() (
     optMap: Option[Map[String, String]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optMap") optMap: Option[Map[String, String]]
  ) =
    this( optMap = optMap)

}
