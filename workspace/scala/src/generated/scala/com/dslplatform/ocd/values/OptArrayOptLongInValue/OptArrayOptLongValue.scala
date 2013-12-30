package com.dslplatform.ocd.values.OptArrayOptLongInValue

import com.fasterxml.jackson.annotation._

case class OptArrayOptLongValue @JsonIgnore() (
     optArrayOptLong: Option[Array[Option[Long]]] = None
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("optArrayOptLong") optArrayOptLong: Option[Array[Option[Long]]]
  ) =
    this( optArrayOptLong = optArrayOptLong)

}
