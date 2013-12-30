package com.dslplatform.ocd.values.SetOptXMLInValue

import com.fasterxml.jackson.annotation._

case class SetOptXMLValue @JsonIgnore() (
     setOptXML: Set[Option[scala.xml.Elem]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptXML") setOptXML: Set[Option[scala.xml.Elem]]
  ) =
    this( setOptXML = if (setOptXML == null) Set.empty else setOptXML)

}
