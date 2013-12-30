package com.dslplatform.ocd.values.OptArrayDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptArrayDecimalValue @JsonIgnore() (
     optArrayDecimal: Option[Array[BigDecimal]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayDecimal") optArrayDecimal: Option[Array[BigDecimal]]
  ) =
    this( optArrayDecimal = optArrayDecimal)

}
