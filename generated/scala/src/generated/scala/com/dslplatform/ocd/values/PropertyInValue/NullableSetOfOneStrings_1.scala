package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfOneStrings_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneStrings: Option[Set[String]] = None
  ) {

    require(nullableSetOfOneStrings ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    if (nullableSetOfOneStrings.isDefined) require(nullableSetOfOneStrings.get ne null, "Null value was provided for property \"nullableSetOfOneStrings\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStrings)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStrings") nullableSetOfOneStrings: Option[Set[String]]
  ) =
    this( nullableSetOfOneStrings = nullableSetOfOneStrings)

}
