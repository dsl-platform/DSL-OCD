package com.dslplatform.ocd.values.OneMoneyInValue

import com.fasterxml.jackson.annotation._

case class OneMoneyValue @JsonIgnore() (
     oneMoney: BigDecimal = BigDecimal(0)
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneMoney") oneMoney: BigDecimal
  ) =
    this( oneMoney = if (oneMoney == null) BigDecimal(0) else oneMoney)

}
