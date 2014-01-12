package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableFloatsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]] = None
  ) {

    require(nullableListOfNullableFloats ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
    if (nullableListOfNullableFloats.isDefined) require(nullableListOfNullableFloats.get ne null, "Null value was provided for property \"nullableListOfNullableFloats\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableFloats)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableFloats") nullableListOfNullableFloats: Option[IndexedSeq[Option[Float]]]
  ) =
    this( nullableListOfNullableFloats = nullableListOfNullableFloats)

}
