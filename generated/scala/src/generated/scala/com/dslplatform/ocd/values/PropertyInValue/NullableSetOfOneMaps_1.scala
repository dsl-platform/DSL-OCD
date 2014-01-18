package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfOneMaps_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneMaps: Option[Set[Map[String, String]]] = None
  ) {

    require(nullableSetOfOneMaps ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    if (nullableSetOfOneMaps.isDefined) require(nullableSetOfOneMaps.get ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMaps") nullableSetOfOneMaps: Option[Set[Map[String, String]]]
  ) =
    this( nullableSetOfOneMaps = nullableSetOfOneMaps)

}
