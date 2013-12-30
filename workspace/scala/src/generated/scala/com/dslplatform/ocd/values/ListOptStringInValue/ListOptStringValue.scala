package com.dslplatform.ocd.values.ListOptStringInValue

import com.fasterxml.jackson.annotation._

case class ListOptStringValue @JsonIgnore() (
     listOptString: IndexedSeq[Option[String]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptString") listOptString: IndexedSeq[Option[String]]
  ) =
    this( listOptString = if (listOptString == null) IndexedSeq.empty else listOptString)

}
