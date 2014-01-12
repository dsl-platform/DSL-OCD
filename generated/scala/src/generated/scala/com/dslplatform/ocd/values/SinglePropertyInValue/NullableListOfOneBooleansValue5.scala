package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneBooleansValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneBooleans: Option[IndexedSeq[Boolean]] = None
  ) {

    require(nullableListOfOneBooleans ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")
    if (nullableListOfOneBooleans.isDefined) require(nullableListOfOneBooleans.get ne null, "Null value was provided for property \"nullableListOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBooleans") nullableListOfOneBooleans: Option[IndexedSeq[Boolean]]
  ) =
    this( nullableListOfOneBooleans = nullableListOfOneBooleans)

}
