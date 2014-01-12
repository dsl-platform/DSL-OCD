package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfNullableMapsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableMaps ne null, "Null value was provided for property \"oneListOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableMaps") oneListOfNullableMaps: IndexedSeq[Option[Map[String, String]]]
  ) =
    this( oneListOfNullableMaps = if (oneListOfNullableMaps == null) IndexedSeq.empty else oneListOfNullableMaps)

}
