package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneBinariesValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneBinaries: Option[Set[Array[Byte]]] = None
  ) {

    require(nullableSetOfOneBinaries ne null, "Null value was provided for property \"nullableSetOfOneBinaries\"")
    if (nullableSetOfOneBinaries.isDefined) require(nullableSetOfOneBinaries.get ne null, "Null value was provided for property \"nullableSetOfOneBinaries\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneBinaries") nullableSetOfOneBinaries: Option[Set[Array[Byte]]]
  ) =
    this( nullableSetOfOneBinaries = nullableSetOfOneBinaries)

}
