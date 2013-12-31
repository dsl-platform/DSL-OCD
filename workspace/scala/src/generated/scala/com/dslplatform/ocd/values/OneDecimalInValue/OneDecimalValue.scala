package com.dslplatform.ocd.values.OneDecimalInValue

import com.fasterxml.jackson.annotation._

case class OneDecimalValue @JsonIgnore() (
     oneDecimal: BigDecimal = 0
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneDecimal") oneDecimal: BigDecimal
  ) =
    this(oneDecimal)

}
