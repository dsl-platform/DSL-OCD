package com.dslplatform.ocd.values.ListDateInValue

import com.fasterxml.jackson.annotation._

case class ListDateValue @JsonIgnore() (
     listDate: IndexedSeq[org.joda.time.LocalDate] = IndexedSeq.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("listDate") listDate: IndexedSeq[org.joda.time.LocalDate]
  ) =
    this( listDate = if (listDate == null) IndexedSeq.empty else listDate)

}
