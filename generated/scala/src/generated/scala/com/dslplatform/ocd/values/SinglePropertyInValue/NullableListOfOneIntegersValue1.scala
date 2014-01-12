package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneIntegersValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneIntegers: Option[IndexedSeq[Int]] = None
  ) {

    require(nullableListOfOneIntegers ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")
    if (nullableListOfOneIntegers.isDefined) require(nullableListOfOneIntegers.get ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIntegers") nullableListOfOneIntegers: Option[IndexedSeq[Int]]
  ) =
    this( nullableListOfOneIntegers = nullableListOfOneIntegers)

}
