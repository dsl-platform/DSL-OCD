package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneDoubles_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneDoubles: Set[Double] = Set.empty
  ) {

    require(oneSetOfOneDoubles ne null, "Null value was provided for property \"oneSetOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles") oneSetOfOneDoubles: Set[Double]
  ) =
    this( oneSetOfOneDoubles = if (oneSetOfOneDoubles == null) Set.empty else oneSetOfOneDoubles)

}
