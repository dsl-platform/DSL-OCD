package com.dslplatform.ocd.values.ArrayXMLInValue

import com.fasterxml.jackson.annotation._

case class ArrayXMLValue @JsonIgnore() (
     arrayXML: Array[scala.xml.Elem] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayXML") arrayXML: Array[scala.xml.Elem]
  ) =
    this( arrayXML = if (arrayXML == null) Array.empty else arrayXML)

}
