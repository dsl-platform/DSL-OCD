package com.dslplatform.ocd.values.OptSetOptMapInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptMapValue @JsonIgnore() (
     optSetOptMap: Option[Set[Option[Map[String, String]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptMap") optSetOptMap: Option[Set[Option[Map[String, String]]]]
  ) =
    this( optSetOptMap = optSetOptMap)

}
