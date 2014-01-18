package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfNullableFloats_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableFloats: Option[Set[Option[Float]]] = None
  ) {

    require(nullableSetOfNullableFloats ne null, "Null value was provided for property \"nullableSetOfNullableFloats\"")
    if (nullableSetOfNullableFloats.isDefined) require(nullableSetOfNullableFloats.get ne null, "Null value was provided for property \"nullableSetOfNullableFloats\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableFloats") nullableSetOfNullableFloats: Option[Set[Option[Float]]]
  ) =
    this( nullableSetOfNullableFloats = nullableSetOfNullableFloats)

}
