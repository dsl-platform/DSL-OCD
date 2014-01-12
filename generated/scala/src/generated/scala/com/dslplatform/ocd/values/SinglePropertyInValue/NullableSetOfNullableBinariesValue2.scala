package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableBinariesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]] = None
  ) {

    require(nullableSetOfNullableBinaries ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    if (nullableSetOfNullableBinaries.isDefined) require(nullableSetOfNullableBinaries.get ne null, "Null value was provided for property \"nullableSetOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableBinaries") nullableSetOfNullableBinaries: Option[Set[Option[Array[Byte]]]]
  ) =
    this( nullableSetOfNullableBinaries = nullableSetOfNullableBinaries)

}
