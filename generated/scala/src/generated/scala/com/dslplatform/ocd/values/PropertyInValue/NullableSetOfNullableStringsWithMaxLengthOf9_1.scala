package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfNullableStringsWithMaxLengthOf9_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableStringsWithMaxLengthOf9: Option[Set[Option[String]]] = None
  ) {

    require(nullableSetOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableSetOfNullableStringsWithMaxLengthOf9\"")
    if (nullableSetOfNullableStringsWithMaxLengthOf9.isDefined) require(nullableSetOfNullableStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableSetOfNullableStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionOptionLength(nullableSetOfNullableStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableStringsWithMaxLengthOf9") nullableSetOfNullableStringsWithMaxLengthOf9: Option[Set[Option[String]]]
  ) =
    this( nullableSetOfNullableStringsWithMaxLengthOf9 = nullableSetOfNullableStringsWithMaxLengthOf9)

}
