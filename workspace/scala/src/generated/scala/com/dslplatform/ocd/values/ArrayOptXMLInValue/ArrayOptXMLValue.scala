package com.dslplatform.ocd.values.ArrayOptXMLInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptXMLValue @JsonIgnore() (
     arrayOptXML: Array[Option[scala.xml.Elem]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptXML") arrayOptXML: Array[Option[scala.xml.Elem]]
  ) =
    this( arrayOptXML = if (arrayOptXML == null) Array.empty else arrayOptXML)

}
