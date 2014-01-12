package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableLongsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableLongs: Option[Set[Option[Long]]] = None
  ) {

    require(nullableSetOfNullableLongs ne null, "Null value was provided for property \"nullableSetOfNullableLongs\"")
    if (nullableSetOfNullableLongs.isDefined) require(nullableSetOfNullableLongs.get ne null, "Null value was provided for property \"nullableSetOfNullableLongs\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableLongs)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableLongs") nullableSetOfNullableLongs: Option[Set[Option[Long]]]
  ) =
    this( nullableSetOfNullableLongs = nullableSetOfNullableLongs)

}
