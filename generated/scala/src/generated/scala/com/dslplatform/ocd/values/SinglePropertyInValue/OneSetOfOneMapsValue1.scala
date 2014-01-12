package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneMapsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneMaps: Set[Map[String, String]] = Set.empty
  ) {

    require(oneSetOfOneMaps ne null, "Null value was provided for property \"oneSetOfOneMaps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMaps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMaps") oneSetOfOneMaps: Set[Map[String, String]]
  ) =
    this( oneSetOfOneMaps = if (oneSetOfOneMaps == null) Set.empty else oneSetOfOneMaps)

}
