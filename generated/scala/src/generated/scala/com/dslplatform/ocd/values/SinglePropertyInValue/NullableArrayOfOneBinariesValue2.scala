package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableArrayOfOneBinariesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfOneBinaries: Option[Array[Array[Byte]]] = None
  ) {

    require(nullableArrayOfOneBinaries ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
    if (nullableArrayOfOneBinaries.isDefined) require(nullableArrayOfOneBinaries.get ne null, "Null value was provided for property \"nullableArrayOfOneBinaries\"")
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneBinaries") nullableArrayOfOneBinaries: Option[Array[Array[Byte]]]
  ) =
    this( nullableArrayOfOneBinaries = nullableArrayOfOneBinaries)

}
