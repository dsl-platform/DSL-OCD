package com.dslplatform.ocd.values.OptListOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptListOptMoneyValue @JsonIgnore() (
     optListOptMoney: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptMoney") optListOptMoney: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( optListOptMoney = optListOptMoney)

}
