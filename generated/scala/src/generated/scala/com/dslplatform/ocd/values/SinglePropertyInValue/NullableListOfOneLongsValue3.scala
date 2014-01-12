package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneLongsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneLongs: Option[IndexedSeq[Long]] = None
  ) {

    require(nullableListOfOneLongs ne null, "Null value was provided for property \"nullableListOfOneLongs\"")
    if (nullableListOfOneLongs.isDefined) require(nullableListOfOneLongs.get ne null, "Null value was provided for property \"nullableListOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneLongs") nullableListOfOneLongs: Option[IndexedSeq[Long]]
  ) =
    this( nullableListOfOneLongs = nullableListOfOneLongs)

}
