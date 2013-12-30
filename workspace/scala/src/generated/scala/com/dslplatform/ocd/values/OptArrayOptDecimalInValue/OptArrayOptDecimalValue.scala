package com.dslplatform.ocd.values.OptArrayOptDecimalInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptDecimalValue @JsonIgnore() (
     optArrayOptDecimal: Option[Array[Option[BigDecimal]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptDecimal") optArrayOptDecimal: Option[Array[Option[BigDecimal]]]
  ) =
    this( optArrayOptDecimal = optArrayOptDecimal)

}
