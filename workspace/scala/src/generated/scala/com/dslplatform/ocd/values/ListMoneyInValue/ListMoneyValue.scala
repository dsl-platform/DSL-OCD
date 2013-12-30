package com.dslplatform.ocd.values.ListMoneyInValue

import com.fasterxml.jackson.annotation._

case class ListMoneyValue @JsonIgnore() (
     listMoney: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listMoney") listMoney: IndexedSeq[BigDecimal]
  ) =
    this( listMoney = if (listMoney == null) IndexedSeq.empty else listMoney)

}
