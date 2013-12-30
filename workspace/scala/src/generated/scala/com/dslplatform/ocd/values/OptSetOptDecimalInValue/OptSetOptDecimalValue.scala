package com.dslplatform.ocd.values.OptSetOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptDecimalValue @JsonIgnore() (
     optSetOptDecimal: Option[Set[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptDecimal") optSetOptDecimal: Option[Set[Option[BigDecimal]]]
  ) =
    this( optSetOptDecimal = optSetOptDecimal)

}
