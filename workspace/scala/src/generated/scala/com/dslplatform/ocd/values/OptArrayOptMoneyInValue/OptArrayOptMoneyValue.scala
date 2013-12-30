package com.dslplatform.ocd.values.OptArrayOptMoneyInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptMoneyValue @JsonIgnore() (
     optArrayOptMoney: Option[Array[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptMoney") optArrayOptMoney: Option[Array[Option[BigDecimal]]]
  ) =
    this( optArrayOptMoney = optArrayOptMoney)

}
