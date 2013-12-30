package com.dslplatform.ocd.values.ListXMLInValue

import com.fasterxml.jackson.annotation._

case class ListXMLValue @JsonIgnore() (
     listXML: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listXML") listXML: IndexedSeq[scala.xml.Elem]
  ) =
    this( listXML = if (listXML == null) IndexedSeq.empty else listXML)

}
