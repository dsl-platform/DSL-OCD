package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneDecimalsValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]] = None
  ) {

    require(nullableListOfOneDecimals ne null, "Null value was provided for property \"nullableListOfOneDecimals\"")
    if (nullableListOfOneDecimals.isDefined) require(nullableListOfOneDecimals.get ne null, "Null value was provided for property \"nullableListOfOneDecimals\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneDecimals)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneDecimals") nullableListOfOneDecimals: Option[IndexedSeq[BigDecimal]]
  ) =
    this( nullableListOfOneDecimals = nullableListOfOneDecimals)

}
