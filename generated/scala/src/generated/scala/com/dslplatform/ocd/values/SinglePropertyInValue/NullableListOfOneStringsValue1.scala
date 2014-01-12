package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneStringsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneStrings: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneStrings ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    if (nullableListOfOneStrings.isDefined) require(nullableListOfOneStrings.get ne null, "Null value was provided for property \"nullableListOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStrings") nullableListOfOneStrings: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneStrings = nullableListOfOneStrings)

}
