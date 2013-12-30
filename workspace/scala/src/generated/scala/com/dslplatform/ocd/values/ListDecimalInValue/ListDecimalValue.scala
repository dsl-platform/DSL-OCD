package com.dslplatform.ocd.values.ListDecimalInValue

import com.fasterxml.jackson.annotation._

case class ListDecimalValue @JsonIgnore() (
     listDecimal: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listDecimal") listDecimal: IndexedSeq[BigDecimal]
  ) =
    this( listDecimal = if (listDecimal == null) IndexedSeq.empty else listDecimal)

}
