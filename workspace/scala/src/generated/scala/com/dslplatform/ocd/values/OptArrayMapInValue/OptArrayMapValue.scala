package com.dslplatform.ocd.values.OptArrayMapInValue

import com.fasterxml.jackson.annotation._

case class OptArrayMapValue @JsonIgnore() (
     optArrayMap: Option[Array[Map[String, String]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayMap") optArrayMap: Option[Array[Map[String, String]]]
  ) =
    this( optArrayMap = optArrayMap)

}
