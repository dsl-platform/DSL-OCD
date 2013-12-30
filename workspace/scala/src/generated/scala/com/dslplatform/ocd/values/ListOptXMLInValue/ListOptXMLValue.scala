package com.dslplatform.ocd.values.ListOptXMLInValue

import com.fasterxml.jackson.annotation._

case class ListOptXMLValue @JsonIgnore() (
     listOptXML: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptXML") listOptXML: IndexedSeq[Option[scala.xml.Elem]]
  ) =
    this( listOptXML = if (listOptXML == null) IndexedSeq.empty else listOptXML)

}
