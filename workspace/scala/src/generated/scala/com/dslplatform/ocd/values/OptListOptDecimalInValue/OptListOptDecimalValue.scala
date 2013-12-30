package com.dslplatform.ocd.values.OptListOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptListOptDecimalValue @JsonIgnore() (
     optListOptDecimal: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptDecimal") optListOptDecimal: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( optListOptDecimal = optListOptDecimal)

}
