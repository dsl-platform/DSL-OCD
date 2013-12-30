package com.dslplatform.ocd.values.SetOptStringInValue

import com.fasterxml.jackson.annotation._

case class SetOptStringValue @JsonIgnore() (
     setOptString: Set[Option[String]] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setOptString") setOptString: Set[Option[String]]
  ) =
    this( setOptString = if (setOptString == null) Set.empty else setOptString)

}
