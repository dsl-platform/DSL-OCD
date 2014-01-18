package com.dslplatform.ocd.values.PropertyInValue

case class NullableListOfOneTexts_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneTexts: Option[IndexedSeq[String]] = None
  ) {

    require(nullableListOfOneTexts ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    if (nullableListOfOneTexts.isDefined) require(nullableListOfOneTexts.get ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTexts") nullableListOfOneTexts: Option[IndexedSeq[String]]
  ) =
    this( nullableListOfOneTexts = nullableListOfOneTexts)

}
