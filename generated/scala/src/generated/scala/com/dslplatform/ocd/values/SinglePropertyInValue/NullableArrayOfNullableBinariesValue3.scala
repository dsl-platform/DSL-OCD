package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfNullableBinariesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]] = None
  ) {

    require(nullableArrayOfNullableBinaries ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    if (nullableArrayOfNullableBinaries.isDefined) require(nullableArrayOfNullableBinaries.get ne null, "Null value was provided for property \"nullableArrayOfNullableBinaries\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableBinaries") nullableArrayOfNullableBinaries: Option[Array[Option[Array[Byte]]]]
  ) =
    this( nullableArrayOfNullableBinaries = nullableArrayOfNullableBinaries)

}
