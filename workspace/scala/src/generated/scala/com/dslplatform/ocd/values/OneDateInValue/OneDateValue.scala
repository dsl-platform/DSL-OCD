package com.dslplatform.ocd.values.OneDateInValue

import com.fasterxml.jackson.annotation._

case class OneDateValue @JsonIgnore() (
     oneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  ) =
    this( oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate)

}
