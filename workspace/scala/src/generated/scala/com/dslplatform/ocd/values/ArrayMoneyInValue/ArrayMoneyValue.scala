package com.dslplatform.ocd.values.ArrayMoneyInValue

import com.fasterxml.jackson.annotation._

case class ArrayMoneyValue @JsonIgnore() (
     arrayMoney: Array[BigDecimal] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayMoney") arrayMoney: Array[BigDecimal]
  ) =
    this( arrayMoney = if (arrayMoney == null) Array.empty else arrayMoney)

}
