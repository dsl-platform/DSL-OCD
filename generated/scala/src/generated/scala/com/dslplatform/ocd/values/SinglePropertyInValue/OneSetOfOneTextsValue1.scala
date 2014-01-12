package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneTextsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneTexts: Set[String] = Set.empty
  ) {

    require(oneSetOfOneTexts ne null, "Null value was provided for property \"oneSetOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneTexts") oneSetOfOneTexts: Set[String]
  ) =
    this( oneSetOfOneTexts = if (oneSetOfOneTexts == null) Set.empty else oneSetOfOneTexts)

}
