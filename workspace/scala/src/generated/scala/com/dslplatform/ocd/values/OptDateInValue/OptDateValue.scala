package com.dslplatform.ocd.values.OptDateInValue

import com.fasterxml.jackson.annotation._

case class OptDateValue @JsonIgnore() (
     optDate: Option[org.joda.time.LocalDate] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optDate") optDate: Option[org.joda.time.LocalDate]
  ) =
    this( optDate = optDate)

}
