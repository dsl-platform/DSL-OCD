package com.dslplatform.ocd.values.OptMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptMoneyValue @JsonIgnore() (
     optMoney: Option[BigDecimal] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optMoney") optMoney: Option[BigDecimal]
  ) =
    this( optMoney = optMoney)

}
