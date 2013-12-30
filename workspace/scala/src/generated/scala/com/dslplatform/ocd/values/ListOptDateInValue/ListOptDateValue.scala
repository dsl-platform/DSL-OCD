package com.dslplatform.ocd.values.ListOptDateInValue

import com.fasterxml.jackson.annotation._

case class ListOptDateValue @JsonIgnore() (
     listOptDate: IndexedSeq[Option[org.joda.time.LocalDate]] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listOptDate") listOptDate: IndexedSeq[Option[org.joda.time.LocalDate]]
  ) =
    this( listOptDate = if (listOptDate == null) IndexedSeq.empty else listOptDate)

}
