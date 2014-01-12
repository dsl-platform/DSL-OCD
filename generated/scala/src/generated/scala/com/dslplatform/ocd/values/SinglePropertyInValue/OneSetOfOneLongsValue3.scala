package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneSetOfOneLongsValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneSetOfOneLongs: Set[Long] = Set.empty
  ) {

    require(oneSetOfOneLongs ne null, "Null value was provided for property \"oneSetOfOneLongs\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneLongs") oneSetOfOneLongs: Set[Long]
  ) =
    this( oneSetOfOneLongs = if (oneSetOfOneLongs == null) Set.empty else oneSetOfOneLongs)

}
