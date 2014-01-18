package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfOneIntegers_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneIntegers: Option[Set[Int]] = None
  ) {

    require(nullableSetOfOneIntegers ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")
    if (nullableSetOfOneIntegers.isDefined) require(nullableSetOfOneIntegers.get ne null, "Null value was provided for property \"nullableSetOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneIntegers") nullableSetOfOneIntegers: Option[Set[Int]]
  ) =
    this( nullableSetOfOneIntegers = nullableSetOfOneIntegers)

}
