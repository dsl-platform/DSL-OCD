package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfNullableMaps_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]] = None
  ) {

    require(nullableSetOfNullableMaps ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    if (nullableSetOfNullableMaps.isDefined) require(nullableSetOfNullableMaps.get ne null, "Null value was provided for property \"nullableSetOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMaps") nullableSetOfNullableMaps: Option[Set[Option[Map[String, String]]]]
  ) =
    this( nullableSetOfNullableMaps = nullableSetOfNullableMaps)

}
