package com.dslplatform.ocd.values.OneStringInValue

import com.fasterxml.jackson.annotation._

case class OneStringValue @JsonIgnore() (
     oneString: String = ""
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("oneString") oneString: String
  ) =
    this( oneString = if (oneString == null) "" else oneString)

}
