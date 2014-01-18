package com.dslplatform.ocd.values.PropertyInValue

case class NullableArrayOfNullableUrls_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = None
  ) {

    require(nullableArrayOfNullableUrls ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    if (nullableArrayOfNullableUrls.isDefined) require(nullableArrayOfNullableUrls.get ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableUrls") nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) =
    this( nullableArrayOfNullableUrls = nullableArrayOfNullableUrls)

}
