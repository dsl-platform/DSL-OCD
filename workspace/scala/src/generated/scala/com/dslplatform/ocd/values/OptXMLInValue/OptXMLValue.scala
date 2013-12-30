package com.dslplatform.ocd.values.OptXMLInValue

import com.fasterxml.jackson.annotation._

case class OptXMLValue @JsonIgnore() (
     optXML: Option[scala.xml.Elem] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optXML") optXML: Option[scala.xml.Elem]
  ) =
    this( optXML = optXML)

}
