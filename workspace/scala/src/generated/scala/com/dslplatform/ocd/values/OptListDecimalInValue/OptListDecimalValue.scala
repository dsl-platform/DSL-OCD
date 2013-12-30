package com.dslplatform.ocd.values.OptListDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptListDecimalValue @JsonIgnore() (
     optListDecimal: Option[IndexedSeq[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListDecimal") optListDecimal: Option[IndexedSeq[BigDecimal]]
  ) =
    this( optListDecimal = optListDecimal)

}
