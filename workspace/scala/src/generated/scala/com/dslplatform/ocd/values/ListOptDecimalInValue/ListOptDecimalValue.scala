package com.dslplatform.ocd.values.ListOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class ListOptDecimalValue @JsonIgnore() (
     listOptDecimal: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptDecimal") listOptDecimal: IndexedSeq[Option[BigDecimal]]
  ) =
    this( listOptDecimal = if (listOptDecimal == null) IndexedSeq.empty else listOptDecimal)

}
