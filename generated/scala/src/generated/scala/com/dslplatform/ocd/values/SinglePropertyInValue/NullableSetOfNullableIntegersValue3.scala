package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableIntegersValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableIntegers: Option[Set[Option[Int]]] = None
  ) {

    require(nullableSetOfNullableIntegers ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    if (nullableSetOfNullableIntegers.isDefined) require(nullableSetOfNullableIntegers.get ne null, "Null value was provided for property \"nullableSetOfNullableIntegers\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableIntegers)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableIntegers") nullableSetOfNullableIntegers: Option[Set[Option[Int]]]
  ) =
    this( nullableSetOfNullableIntegers = nullableSetOfNullableIntegers)

}
