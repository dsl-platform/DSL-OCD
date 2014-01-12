package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneGuidsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]] = None
  ) {

    require(nullableListOfOneGuids ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    if (nullableListOfOneGuids.isDefined) require(nullableListOfOneGuids.get ne null, "Null value was provided for property \"nullableListOfOneGuids\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneGuids") nullableListOfOneGuids: Option[IndexedSeq[java.util.UUID]]
  ) =
    this( nullableListOfOneGuids = nullableListOfOneGuids)

}
