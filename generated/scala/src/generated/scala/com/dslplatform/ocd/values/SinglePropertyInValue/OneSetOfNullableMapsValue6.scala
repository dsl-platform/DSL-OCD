package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfNullableMapsValue6 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfNullableMaps: Set[Option[Map[String, String]]] = Set.empty
  ) {

    require(oneSetOfNullableMaps ne null, "Null value was provided for property \"oneSetOfNullableMaps\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMaps") oneSetOfNullableMaps: Set[Option[Map[String, String]]]
  ) =
    this( oneSetOfNullableMaps = if (oneSetOfNullableMaps == null) Set.empty else oneSetOfNullableMaps)

}
