package com.dslplatform.ocd.values.ArrayOptStringInValue

import com.fasterxml.jackson.annotation._

case class ArrayOptStringValue @JsonIgnore() (
     arrayOptString: Array[Option[String]] = Array.empty
  ) {

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: com.dslplatform.api.patterns.ServiceLocator
  , @JsonProperty("arrayOptString") arrayOptString: Array[Option[String]]
  ) =
    this( arrayOptString = if (arrayOptString == null) Array.empty else arrayOptString)

}
