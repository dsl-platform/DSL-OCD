package com.dslplatform.ocd.values.SetOptDateInValue

import com.fasterxml.jackson.annotation._

case class SetOptDateValue @JsonIgnore() (
     setOptDate: Set[Option[org.joda.time.LocalDate]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptDate") setOptDate: Set[Option[org.joda.time.LocalDate]]
  ) =
    this( setOptDate = if (setOptDate == null) Set.empty else setOptDate)

}
