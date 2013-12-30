package com.dslplatform.ocd.values.OptSetMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptSetMoneyValue @JsonIgnore() (
     optSetMoney: Option[Set[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetMoney") optSetMoney: Option[Set[BigDecimal]]
  ) =
    this( optSetMoney = optSetMoney)

}
