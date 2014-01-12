package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableStringsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]] = None
  ) {

    require(nullableListOfNullableStrings ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    if (nullableListOfNullableStrings.isDefined) require(nullableListOfNullableStrings.get ne null, "Null value was provided for property \"nullableListOfNullableStrings\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableStrings") nullableListOfNullableStrings: Option[IndexedSeq[Option[String]]]
  ) =
    this( nullableListOfNullableStrings = nullableListOfNullableStrings)

}
