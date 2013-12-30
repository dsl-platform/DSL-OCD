package com.dslplatform.ocd.values.OptSetOptDateInValue

import com.fasterxml.jackson.annotation._

case class OptSetOptDateValue @JsonIgnore() (
     optSetOptDate: Option[Set[Option[org.joda.time.LocalDate]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optSetOptDate") optSetOptDate: Option[Set[Option[org.joda.time.LocalDate]]]
  ) =
    this( optSetOptDate = optSetOptDate)

}
