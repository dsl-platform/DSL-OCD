package com.dslplatform.ocd.values.ArrayDateInValue

import com.fasterxml.jackson.annotation._

case class ArrayDateValue @JsonIgnore() (
     arrayDate: Array[org.joda.time.LocalDate] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayDate") arrayDate: Array[org.joda.time.LocalDate]
  ) =
    this( arrayDate = if (arrayDate == null) Array.empty else arrayDate)

}
