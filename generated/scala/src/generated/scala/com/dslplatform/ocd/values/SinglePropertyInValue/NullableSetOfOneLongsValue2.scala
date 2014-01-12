package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneLongsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneLongs: Option[Set[Long]] = None
  ) {

    require(nullableSetOfOneLongs ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")
    if (nullableSetOfOneLongs.isDefined) require(nullableSetOfOneLongs.get ne null, "Null value was provided for property \"nullableSetOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneLongs") nullableSetOfOneLongs: Option[Set[Long]]
  ) =
    this( nullableSetOfOneLongs = nullableSetOfOneLongs)

}
