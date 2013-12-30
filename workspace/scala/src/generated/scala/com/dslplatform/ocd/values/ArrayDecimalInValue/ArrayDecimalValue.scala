package com.dslplatform.ocd.values.ArrayDecimalInValue

import com.fasterxml.jackson.annotation._

case class ArrayDecimalValue @JsonIgnore() (
     arrayDecimal: Array[BigDecimal] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayDecimal") arrayDecimal: Array[BigDecimal]
  ) =
    this( arrayDecimal = if (arrayDecimal == null) Array.empty else arrayDecimal)

}
