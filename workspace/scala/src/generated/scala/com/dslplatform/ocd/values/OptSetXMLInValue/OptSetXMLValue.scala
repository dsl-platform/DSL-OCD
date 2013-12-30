package com.dslplatform.ocd.values.OptSetXMLInValue

import com.fasterxml.jackson.annotation._

case class OptSetXMLValue @JsonIgnore() (
     optSetXML: Option[Set[scala.xml.Elem]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetXML") optSetXML: Option[Set[scala.xml.Elem]]
  ) =
    this( optSetXML = optSetXML)

}
