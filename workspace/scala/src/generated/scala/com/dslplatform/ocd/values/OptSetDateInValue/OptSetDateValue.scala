package com.dslplatform.ocd.values.OptSetDateInValue

import com.fasterxml.jackson.annotation._

case class OptSetDateValue @JsonIgnore() (
     optSetDate: Option[Set[org.joda.time.LocalDate]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetDate") optSetDate: Option[Set[org.joda.time.LocalDate]]
  ) =
    this( optSetDate = optSetDate)

}
