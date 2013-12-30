package com.dslplatform.ocd.values.SetStringInValue

import com.fasterxml.jackson.annotation._

case class SetStringValue @JsonIgnore() (
     setString: Set[String] = Set.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("setString") setString: Set[String]
  ) =
    this( setString = if (setString == null) Set.empty else setString)

}
