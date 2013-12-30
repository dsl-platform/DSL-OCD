package com.dslplatform.ocd.values.OptDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptDecimalValue @JsonIgnore() (
     optDecimal: Option[BigDecimal] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optDecimal") optDecimal: Option[BigDecimal]
  ) =
    this( optDecimal = optDecimal)

}
