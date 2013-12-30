package com.dslplatform.ocd.values.OptListOptDateInValue

import com.fasterxml.jackson.annotation._

case class OptListOptDateValue @JsonIgnore() (
     optListOptDate: Option[IndexedSeq[Option[org.joda.time.LocalDate]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optListOptDate") optListOptDate: Option[IndexedSeq[Option[org.joda.time.LocalDate]]]
  ) =
    this( optListOptDate = optListOptDate)

}
