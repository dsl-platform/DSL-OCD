package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableBinariesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableBinaries: Option[IndexedSeq[Option[Array[Byte]]]] = None
  ) {

    require(nullableListOfNullableBinaries ne null, "Null value was provided for property \"nullableListOfNullableBinaries\"")
    if (nullableListOfNullableBinaries.isDefined) require(nullableListOfNullableBinaries.get ne null, "Null value was provided for property \"nullableListOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBinaries") nullableListOfNullableBinaries: Option[IndexedSeq[Option[Array[Byte]]]]
  ) =
    this( nullableListOfNullableBinaries = nullableListOfNullableBinaries)

}
