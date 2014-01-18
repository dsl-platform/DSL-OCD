package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfNullableFloats_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableFloats: Set[Option[Float]] = Set.empty
  ) {

    require(oneSetOfNullableFloats ne null, "Null value was provided for property \"oneSetOfNullableFloats\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableFloats") oneSetOfNullableFloats: Set[Option[Float]]
  ) =
    this( oneSetOfNullableFloats = if (oneSetOfNullableFloats == null) Set.empty else oneSetOfNullableFloats)

}
