package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableStringsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableStrings: Option[Set[Option[String]]] = None
  ) {

    require(nullableSetOfNullableStrings ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    if (nullableSetOfNullableStrings.isDefined) require(nullableSetOfNullableStrings.get ne null, "Null value was provided for property \"nullableSetOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStrings") nullableSetOfNullableStrings: Option[Set[Option[String]]]
  ) =
    this( nullableSetOfNullableStrings = nullableSetOfNullableStrings)

}
