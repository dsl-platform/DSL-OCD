package com.dslplatform.ocd.values.OptArrayXMLInValue

import com.fasterxml.jackson.annotation._

case class OptArrayXMLValue @JsonIgnore() (
     optArrayXML: Option[Array[scala.xml.Elem]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayXML") optArrayXML: Option[Array[scala.xml.Elem]]
  ) =
    this( optArrayXML = optArrayXML)

}
