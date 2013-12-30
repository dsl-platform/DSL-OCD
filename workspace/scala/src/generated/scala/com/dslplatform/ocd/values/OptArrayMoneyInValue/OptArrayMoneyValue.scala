package com.dslplatform.ocd.values.OptArrayMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptArrayMoneyValue @JsonIgnore() (
     optArrayMoney: Option[Array[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayMoney") optArrayMoney: Option[Array[BigDecimal]]
  ) =
    this( optArrayMoney = optArrayMoney)

}
