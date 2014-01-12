package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfNullableTextsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]] = None
  ) {

    require(nullableListOfNullableTexts ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
    if (nullableListOfNullableTexts.isDefined) require(nullableListOfNullableTexts.get ne null, "Null value was provided for property \"nullableListOfNullableTexts\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableTexts") nullableListOfNullableTexts: Option[IndexedSeq[Option[String]]]
  ) =
    this( nullableListOfNullableTexts = nullableListOfNullableTexts)

}
