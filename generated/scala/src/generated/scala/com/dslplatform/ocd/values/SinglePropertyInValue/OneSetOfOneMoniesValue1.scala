package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneMoniesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneMonies: Set[BigDecimal] = Set.empty
  ) {

    require(oneSetOfOneMonies ne null, "Null value was provided for property \"oneSetOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMonies") oneSetOfOneMonies: Set[BigDecimal]
  ) =
    this( oneSetOfOneMonies = if (oneSetOfOneMonies == null) Set.empty else oneSetOfOneMonies)

}
