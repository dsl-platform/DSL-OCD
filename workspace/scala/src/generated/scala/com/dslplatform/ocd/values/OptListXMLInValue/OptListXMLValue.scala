package com.dslplatform.ocd.values.OptListXMLInValue

import com.fasterxml.jackson.annotation._

case class OptListXMLValue @JsonIgnore() (
     optListXML: Option[IndexedSeq[scala.xml.Elem]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListXML") optListXML: Option[IndexedSeq[scala.xml.Elem]]
  ) =
    this( optListXML = optListXML)

}
