package com.dslplatform.ocd.values.ArrayOptDateInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptDateValue @JsonIgnore() (
     arrayOptDate: Array[Option[org.joda.time.LocalDate]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptDate") arrayOptDate: Array[Option[org.joda.time.LocalDate]]
  ) =
    this( arrayOptDate = if (arrayOptDate == null) Array.empty else arrayOptDate)

}
