package com.dslplatform.ocd.values.SetOptLongInValue

import com.fasterxml.jackson.annotation._

case class SetOptLongValue @JsonIgnore() (
     setOptLong: Set[Option[Long]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptLong") setOptLong: Set[Option[Long]]
  ) =
    this( setOptLong = if (setOptLong == null) Set.empty else setOptLong)

}
