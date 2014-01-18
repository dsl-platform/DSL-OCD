package com.dslplatform.ocd.values.PropertyInValue

case class OneSetOfOneStringsWithMaxLengthOf9_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneStringsWithMaxLengthOf9: Set[String] = Set.empty
  ) {

    require(oneSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfOneStringsWithMaxLengthOf9\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStringsWithMaxLengthOf9)
    com.dslplatform.api.Guards.checkCollectionLength(oneSetOfOneStringsWithMaxLengthOf9, 9)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStringsWithMaxLengthOf9") oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) =
    this( oneSetOfOneStringsWithMaxLengthOf9 = if (oneSetOfOneStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfOneStringsWithMaxLengthOf9)

}
