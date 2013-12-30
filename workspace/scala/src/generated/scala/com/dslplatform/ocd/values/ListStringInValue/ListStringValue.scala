package com.dslplatform.ocd.values.ListStringInValue

import com.fasterxml.jackson.annotation._

case class ListStringValue @JsonIgnore() (
     listString: IndexedSeq[String] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listString") listString: IndexedSeq[String]
  ) =
    this( listString = if (listString == null) IndexedSeq.empty else listString)

}
