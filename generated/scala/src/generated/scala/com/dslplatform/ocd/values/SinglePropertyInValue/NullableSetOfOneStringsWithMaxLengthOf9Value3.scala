package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneStringsWithMaxLengthOf9Value3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = None
  ) {

    require(nullableSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    if (nullableSetOfOneStringsWithMaxLengthOf9.isDefined) require(nullableSetOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(nullableSetOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9") nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) =
    this( nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9)

}
