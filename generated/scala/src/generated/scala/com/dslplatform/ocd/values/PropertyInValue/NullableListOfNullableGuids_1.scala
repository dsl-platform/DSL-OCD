package com.dslplatform.ocd.values.PropertyInValue

case class NullableListOfNullableGuids_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]] = None
  ) {

    require(nullableListOfNullableGuids ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    if (nullableListOfNullableGuids.isDefined) require(nullableListOfNullableGuids.get ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableGuids") nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  ) =
    this( nullableListOfNullableGuids = nullableListOfNullableGuids)

}
