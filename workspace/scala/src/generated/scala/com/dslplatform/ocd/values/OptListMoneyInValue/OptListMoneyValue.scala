package com.dslplatform.ocd.values.OptListMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptListMoneyValue @JsonIgnore() (
     optListMoney: Option[IndexedSeq[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListMoney") optListMoney: Option[IndexedSeq[BigDecimal]]
  ) =
    this( optListMoney = optListMoney)

}
