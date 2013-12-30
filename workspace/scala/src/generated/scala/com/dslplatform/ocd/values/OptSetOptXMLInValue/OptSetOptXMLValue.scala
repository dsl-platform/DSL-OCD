package com.dslplatform.ocd.values.OptSetOptXMLInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptXMLValue @JsonIgnore() (
     optSetOptXML: Option[Set[Option[scala.xml.Elem]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptXML") optSetOptXML: Option[Set[Option[scala.xml.Elem]]]
  ) =
    this( optSetOptXML = optSetOptXML)

}
