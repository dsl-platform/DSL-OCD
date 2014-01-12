package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableGuidsValue5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]] = None
  ) {

    require(nullableSetOfNullableGuids ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
    if (nullableSetOfNullableGuids.isDefined) require(nullableSetOfNullableGuids.get ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableGuids") nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]]
  ) =
    this( nullableSetOfNullableGuids = nullableSetOfNullableGuids)

}
