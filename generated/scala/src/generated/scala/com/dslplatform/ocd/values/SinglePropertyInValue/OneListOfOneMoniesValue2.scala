package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneMoniesValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneMonies: IndexedSeq[BigDecimal] = IndexedSeq.empty
  ) {

    require(oneListOfOneMonies ne null, "Null value was provided for property \"oneListOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneMonies") oneListOfOneMonies: IndexedSeq[BigDecimal]
  ) =
    this( oneListOfOneMonies = if (oneListOfOneMonies == null) IndexedSeq.empty else oneListOfOneMonies)

}
