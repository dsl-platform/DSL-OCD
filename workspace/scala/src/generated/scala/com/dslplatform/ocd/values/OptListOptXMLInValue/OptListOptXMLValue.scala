package com.dslplatform.ocd.values.OptListOptXMLInValue

import com.fasterxml.jackson.annotation._

case class OptListOptXMLValue @JsonIgnore() (
     optListOptXML: Option[IndexedSeq[Option[scala.xml.Elem]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptXML") optListOptXML: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) =
    this( optListOptXML = optListOptXML)

}
