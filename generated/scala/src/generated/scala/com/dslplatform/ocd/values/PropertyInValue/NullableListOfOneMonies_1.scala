package com.dslplatform.ocd.values.PropertyInValue

case class NullableListOfOneMonies_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = None
  ) {

    require(nullableListOfOneMonies ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    if (nullableListOfOneMonies.isDefined) require(nullableListOfOneMonies.get ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMonies)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMonies") nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) =
    this( nullableListOfOneMonies = nullableListOfOneMonies)

}
