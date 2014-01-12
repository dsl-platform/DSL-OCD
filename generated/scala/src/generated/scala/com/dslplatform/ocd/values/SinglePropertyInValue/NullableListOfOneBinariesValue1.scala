package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableListOfOneBinariesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]] = None
  ) {

    require(nullableListOfOneBinaries ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
    if (nullableListOfOneBinaries.isDefined) require(nullableListOfOneBinaries.get ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneBinaries)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBinaries") nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  ) =
    this( nullableListOfOneBinaries = nullableListOfOneBinaries)

}
