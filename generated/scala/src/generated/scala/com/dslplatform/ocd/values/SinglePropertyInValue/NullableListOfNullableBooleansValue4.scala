package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableBooleansValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]] = None
  ) {

    require(nullableListOfNullableBooleans ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
    if (nullableListOfNullableBooleans.isDefined) require(nullableListOfNullableBooleans.get ne null, "Null value was provided for property \"nullableListOfNullableBooleans\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableListOfNullableBooleans)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableBooleans") nullableListOfNullableBooleans: Option[IndexedSeq[Option[Boolean]]]
  ) =
    this( nullableListOfNullableBooleans = nullableListOfNullableBooleans)

}
