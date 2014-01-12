package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneIntegersValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneIntegers: Set[Int] = Set.empty
  ) {

    require(oneSetOfOneIntegers ne null, "Null value was provided for property \"oneSetOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneIntegers") oneSetOfOneIntegers: Set[Int]
  ) =
    this( oneSetOfOneIntegers = if (oneSetOfOneIntegers == null) Set.empty else oneSetOfOneIntegers)

}
