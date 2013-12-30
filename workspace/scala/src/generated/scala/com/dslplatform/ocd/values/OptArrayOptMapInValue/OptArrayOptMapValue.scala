package com.dslplatform.ocd.values.OptArrayOptMapInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptMapValue @JsonIgnore() (
     optArrayOptMap: Option[Array[Option[Map[String, String]]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptMap") optArrayOptMap: Option[Array[Option[Map[String, String]]]]
  ) =
    this( optArrayOptMap = optArrayOptMap)

}
