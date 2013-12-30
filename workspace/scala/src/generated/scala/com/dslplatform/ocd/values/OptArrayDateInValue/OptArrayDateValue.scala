package com.dslplatform.ocd.values.OptArrayDateInValue

import com.fasterxml.jackson.annotation._

case class OptArrayDateValue @JsonIgnore() (
     optArrayDate: Option[Array[org.joda.time.LocalDate]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayDate") optArrayDate: Option[Array[org.joda.time.LocalDate]]
  ) =
    this( optArrayDate = optArrayDate)

}
