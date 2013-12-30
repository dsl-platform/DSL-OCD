package com.dslplatform.ocd.values.OptListDateInValue

import com.fasterxml.jackson.annotation._

case class OptListDateValue @JsonIgnore() (
     optListDate: Option[IndexedSeq[org.joda.time.LocalDate]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListDate") optListDate: Option[IndexedSeq[org.joda.time.LocalDate]]
  ) =
    this( optListDate = optListDate)

}
