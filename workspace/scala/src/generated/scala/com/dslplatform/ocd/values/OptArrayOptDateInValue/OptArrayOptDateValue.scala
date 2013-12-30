package com.dslplatform.ocd.values.OptArrayOptDateInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptDateValue @JsonIgnore() (
     optArrayOptDate: Option[Array[Option[org.joda.time.LocalDate]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptDate") optArrayOptDate: Option[Array[Option[org.joda.time.LocalDate]]]
  ) =
    this( optArrayOptDate = optArrayOptDate)

}
