package com.dslplatform.ocd.values.OptArrayOptXMLInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptXMLValue @JsonIgnore() (
     optArrayOptXML: Option[Array[Option[scala.xml.Elem]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptXML") optArrayOptXML: Option[Array[Option[scala.xml.Elem]]]
  ) =
    this( optArrayOptXML = optArrayOptXML)

}
