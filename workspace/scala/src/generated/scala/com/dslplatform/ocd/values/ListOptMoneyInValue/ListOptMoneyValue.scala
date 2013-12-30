package com.dslplatform.ocd.values.ListOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class ListOptMoneyValue @JsonIgnore() (
     listOptMoney: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptMoney") listOptMoney: IndexedSeq[Option[BigDecimal]]
  ) =
    this( listOptMoney = if (listOptMoney == null) IndexedSeq.empty else listOptMoney)

}
