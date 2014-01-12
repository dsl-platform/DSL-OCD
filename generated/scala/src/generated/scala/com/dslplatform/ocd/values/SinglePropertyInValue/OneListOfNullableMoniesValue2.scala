package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableMoniesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableMonies ne null, "Null value was provided for property \"oneListOfNullableMonies\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMonies") oneListOfNullableMonies: IndexedSeq[Option[BigDecimal]]
  ) =
    this( oneListOfNullableMonies = if (oneListOfNullableMonies == null) IndexedSeq.empty else oneListOfNullableMonies)

}
