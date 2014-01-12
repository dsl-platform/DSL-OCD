package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableMapsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableMaps: Option[IndexedSeq[Option[Map[String, String]]]] = None
  ) {

    require(nullableListOfNullableMaps ne null, "Null value was provided for property \"nullableListOfNullableMaps\"")
    if (nullableListOfNullableMaps.isDefined) require(nullableListOfNullableMaps.get ne null, "Null value was provided for property \"nullableListOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableMaps") nullableListOfNullableMaps: Option[IndexedSeq[Option[Map[String, String]]]]
  ) =
    this( nullableListOfNullableMaps = nullableListOfNullableMaps)

}
