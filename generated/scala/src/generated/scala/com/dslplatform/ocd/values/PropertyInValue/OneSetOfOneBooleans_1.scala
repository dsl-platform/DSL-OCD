package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneBooleans_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneBooleans: Set[Boolean] = Set.empty
  ) {

    require(oneSetOfOneBooleans ne null, "Null value was provided for property \"oneSetOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBooleans") oneSetOfOneBooleans: Set[Boolean]
  ) =
    this( oneSetOfOneBooleans = if (oneSetOfOneBooleans == null) Set.empty else oneSetOfOneBooleans)

}
