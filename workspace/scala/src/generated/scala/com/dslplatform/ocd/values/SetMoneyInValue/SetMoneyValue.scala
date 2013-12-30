package com.dslplatform.ocd.values.SetMoneyInValue

import com.fasterxml.jackson.annotation._

case class SetMoneyValue @JsonIgnore() (
     setMoney: Set[BigDecimal] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setMoney") setMoney: Set[BigDecimal]
  ) =
    this( setMoney = if (setMoney == null) Set.empty else setMoney)

}
