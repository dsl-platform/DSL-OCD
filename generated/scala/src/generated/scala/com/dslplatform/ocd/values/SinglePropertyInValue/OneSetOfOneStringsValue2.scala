package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneStringsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneStrings: Set[String] = Set.empty
  ) {

    require(oneSetOfOneStrings ne null, "Null value was provided for property \"oneSetOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStrings") oneSetOfOneStrings: Set[String]
  ) =
    this( oneSetOfOneStrings = if (oneSetOfOneStrings == null) Set.empty else oneSetOfOneStrings)

}
