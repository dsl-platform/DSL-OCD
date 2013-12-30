package com.dslplatform.ocd.values.OptSetOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptMoneyValue @JsonIgnore() (
     optSetOptMoney: Option[Set[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptMoney") optSetOptMoney: Option[Set[Option[BigDecimal]]]
  ) =
    this( optSetOptMoney = optSetOptMoney)

}
