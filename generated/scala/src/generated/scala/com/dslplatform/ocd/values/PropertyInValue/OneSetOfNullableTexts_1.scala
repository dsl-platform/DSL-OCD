package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfNullableTexts_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableTexts: Set[Option[String]] = Set.empty
  ) {

    require(oneSetOfNullableTexts ne null, "Null value was provided for property \"oneSetOfNullableTexts\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableTexts") oneSetOfNullableTexts: Set[Option[String]]
  ) =
    this( oneSetOfNullableTexts = if (oneSetOfNullableTexts == null) Set.empty else oneSetOfNullableTexts)

}
