package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfOneIntegers_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneIntegers: IndexedSeq[Int] = IndexedSeq.empty
  ) {

    require(oneListOfOneIntegers ne null, "Null value was provided for property \"oneListOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneIntegers") oneListOfOneIntegers: IndexedSeq[Int]
  ) =
    this( oneListOfOneIntegers = if (oneListOfOneIntegers == null) IndexedSeq.empty else oneListOfOneIntegers)

}
