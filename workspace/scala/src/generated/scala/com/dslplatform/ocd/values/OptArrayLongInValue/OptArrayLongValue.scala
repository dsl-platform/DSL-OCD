package com.dslplatform.ocd.values.OptArrayLongInValue

import com.fasterxml.jackson.annotation._

case class OptArrayLongValue @JsonIgnore() (
     optArrayLong: Option[Array[Long]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayLong") optArrayLong: Option[Array[Long]]
  ) =
    this( optArrayLong = optArrayLong)

}
