package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneDecimalsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneDecimals: Option[Set[BigDecimal]] = None
  ) {

    require(nullableSetOfOneDecimals ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    if (nullableSetOfOneDecimals.isDefined) require(nullableSetOfOneDecimals.get ne null, "Null value was provided for property \"nullableSetOfOneDecimals\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDecimals") nullableSetOfOneDecimals: Option[Set[BigDecimal]]
  ) =
    this( nullableSetOfOneDecimals = nullableSetOfOneDecimals)

}
