package com.dslplatform.ocd.values.SetDateInValue

import com.fasterxml.jackson.annotation._

case class SetDateValue @JsonIgnore() (
     setDate: Set[org.joda.time.LocalDate] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setDate") setDate: Set[org.joda.time.LocalDate]
  ) =
    this( setDate = if (setDate == null) Set.empty else setDate)

}
