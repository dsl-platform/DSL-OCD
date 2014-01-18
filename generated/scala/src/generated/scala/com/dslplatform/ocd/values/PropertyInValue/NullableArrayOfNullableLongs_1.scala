package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfNullableLongs_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableLongs: Option[Array[Option[Long]]] = None
  ) {

    require(nullableArrayOfNullableLongs ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    if (nullableArrayOfNullableLongs.isDefined) require(nullableArrayOfNullableLongs.get ne null, "Null value was provided for property \"nullableArrayOfNullableLongs\"")
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableLongs") nullableArrayOfNullableLongs: Option[Array[Option[Long]]]
  ) =
    this( nullableArrayOfNullableLongs = nullableArrayOfNullableLongs)

}
