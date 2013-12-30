package com.dslplatform.ocd.values.ArrayOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptMoneyValue @JsonIgnore() (
     arrayOptMoney: Array[Option[BigDecimal]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptMoney") arrayOptMoney: Array[Option[BigDecimal]]
  ) =
    this( arrayOptMoney = if (arrayOptMoney == null) Array.empty else arrayOptMoney)

}
