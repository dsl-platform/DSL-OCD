package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneTextsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneTexts: Option[Set[String]] = None
  ) {

    require(nullableSetOfOneTexts ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
    if (nullableSetOfOneTexts.isDefined) require(nullableSetOfOneTexts.get ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneTexts)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneTexts") nullableSetOfOneTexts: Option[Set[String]]
  ) =
    this( nullableSetOfOneTexts = nullableSetOfOneTexts)

}
