package com.dslplatform.ocd.values.SetOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class SetOptMoneyValue @JsonIgnore() (
     setOptMoney: Set[Option[BigDecimal]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptMoney") setOptMoney: Set[Option[BigDecimal]]
  ) =
    this( setOptMoney = if (setOptMoney == null) Set.empty else setOptMoney)

}
