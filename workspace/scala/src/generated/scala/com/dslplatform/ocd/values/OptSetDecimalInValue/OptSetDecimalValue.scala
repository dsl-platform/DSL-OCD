package com.dslplatform.ocd.values.OptSetDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptSetDecimalValue @JsonIgnore() (
     optSetDecimal: Option[Set[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetDecimal") optSetDecimal: Option[Set[BigDecimal]]
  ) =
    this( optSetDecimal = optSetDecimal)

}
