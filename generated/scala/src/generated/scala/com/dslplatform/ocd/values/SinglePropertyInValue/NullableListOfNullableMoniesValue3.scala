package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableMoniesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]] = None
  ) {

    require(nullableListOfNullableMonies ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
    if (nullableListOfNullableMonies.isDefined) require(nullableListOfNullableMonies.get ne null, "Null value was provided for property \"nullableListOfNullableMonies\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableMonies") nullableListOfNullableMonies: Option[IndexedSeq[Option[BigDecimal]]]
  ) =
    this( nullableListOfNullableMonies = nullableListOfNullableMonies)

}
