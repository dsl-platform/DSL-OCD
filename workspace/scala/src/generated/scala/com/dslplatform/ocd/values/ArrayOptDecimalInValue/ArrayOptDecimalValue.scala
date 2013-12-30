package com.dslplatform.ocd.values.ArrayOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptDecimalValue @JsonIgnore() (
     arrayOptDecimal: Array[Option[BigDecimal]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptDecimal") arrayOptDecimal: Array[Option[BigDecimal]]
  ) =
    this( arrayOptDecimal = if (arrayOptDecimal == null) Array.empty else arrayOptDecimal)

}
