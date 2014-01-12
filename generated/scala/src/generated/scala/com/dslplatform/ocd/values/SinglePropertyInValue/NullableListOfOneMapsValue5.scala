package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneMapsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]] = None
  ) {

    require(nullableListOfOneMaps ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    if (nullableListOfOneMaps.isDefined) require(nullableListOfOneMaps.get ne null, "Null value was provided for property \"nullableListOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMaps") nullableListOfOneMaps: Option[IndexedSeq[Map[String, String]]]
  ) =
    this( nullableListOfOneMaps = nullableListOfOneMaps)

}
