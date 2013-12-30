package com.dslplatform.ocd.values.SetXMLInValue

import com.fasterxml.jackson.annotation._

case class SetXMLValue @JsonIgnore() (
     setXML: Set[scala.xml.Elem] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setXML") setXML: Set[scala.xml.Elem]
  ) =
    this( setXML = if (setXML == null) Set.empty else setXML)

}
