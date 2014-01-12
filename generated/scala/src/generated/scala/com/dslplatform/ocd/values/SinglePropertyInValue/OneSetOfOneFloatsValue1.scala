package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneFloatsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneFloats: Set[Float] = Set.empty
  ) {

    require(oneSetOfOneFloats ne null, "Null value was provided for property \"oneSetOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneFloats") oneSetOfOneFloats: Set[Float]
  ) =
    this( oneSetOfOneFloats = if (oneSetOfOneFloats == null) Set.empty else oneSetOfOneFloats)

}
