package com.dslplatform.ocd.values.OneXMLInValue

import com.fasterxml.jackson.annotation._

case class OneXMLValue @JsonIgnore() (
     oneXML: scala.xml.Elem = null
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneXML") oneXML: scala.xml.Elem
  ) =
    this( oneXML = if (oneXML == null) null else oneXML)

}
