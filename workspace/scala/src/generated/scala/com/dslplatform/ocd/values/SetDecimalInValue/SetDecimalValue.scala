package com.dslplatform.ocd.values.SetDecimalInValue

import com.fasterxml.jackson.annotation._

case class SetDecimalValue @JsonIgnore() (
     setDecimal: Set[BigDecimal] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setDecimal") setDecimal: Set[BigDecimal]
  ) =
    this( setDecimal = if (setDecimal == null) Set.empty else setDecimal)

}
