package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneTimestampsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneTimestamps: Option[Set[org.joda.time.DateTime]] = None
  ) {

    require(nullableSetOfOneTimestamps ne null, "Null value was provided for property \"nullableSetOfOneTimestamps\"")
    if (nullableSetOfOneTimestamps.isDefined) require(nullableSetOfOneTimestamps.get ne null, "Null value was provided for property \"nullableSetOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneTimestamps") nullableSetOfOneTimestamps: Option[Set[org.joda.time.DateTime]]
  ) =
    this( nullableSetOfOneTimestamps = nullableSetOfOneTimestamps)

}
