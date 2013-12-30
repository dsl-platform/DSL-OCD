package com.dslplatform.ocd.values.SetOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class SetOptDecimalValue @JsonIgnore() (
     setOptDecimal: Set[Option[BigDecimal]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptDecimal") setOptDecimal: Set[Option[BigDecimal]]
  ) =
    this( setOptDecimal = if (setOptDecimal == null) Set.empty else setOptDecimal)

}
