package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneBooleansValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneBooleans: Option[Set[Boolean]] = None
  ) {

    require(nullableSetOfOneBooleans ne null, "Null value was provided for property \"nullableSetOfOneBooleans\"")
    if (nullableSetOfOneBooleans.isDefined) require(nullableSetOfOneBooleans.get ne null, "Null value was provided for property \"nullableSetOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneBooleans") nullableSetOfOneBooleans: Option[Set[Boolean]]
  ) =
    this( nullableSetOfOneBooleans = nullableSetOfOneBooleans)

}
