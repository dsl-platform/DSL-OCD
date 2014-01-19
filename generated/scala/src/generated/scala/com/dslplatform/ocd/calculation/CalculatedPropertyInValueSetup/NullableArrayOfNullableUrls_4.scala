package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class NullableArrayOfNullableUrls_4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = None,
     calculatedNullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = None,
     persistedNullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]] = None
  ) {

    require(nullableArrayOfNullableUrls ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    if (nullableArrayOfNullableUrls.isDefined) require(nullableArrayOfNullableUrls.get ne null, "Null value was provided for property \"nullableArrayOfNullableUrls\"")
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableUrls") nullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableUrls") calculatedNullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableUrls") persistedNullableArrayOfNullableUrls: Option[Array[Option[java.net.URI]]]
  ) =
    this( nullableArrayOfNullableUrls = nullableArrayOfNullableUrls, calculatedNullableArrayOfNullableUrls = calculatedNullableArrayOfNullableUrls, persistedNullableArrayOfNullableUrls = persistedNullableArrayOfNullableUrls)

}
