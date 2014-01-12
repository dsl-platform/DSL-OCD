package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneDoublesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneDoubles: IndexedSeq[Double] = IndexedSeq.empty
  ) {

    require(oneListOfOneDoubles ne null, "Null value was provided for property \"oneListOfOneDoubles\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneDoubles") oneListOfOneDoubles: IndexedSeq[Double]
  ) =
    this( oneListOfOneDoubles = if (oneListOfOneDoubles == null) IndexedSeq.empty else oneListOfOneDoubles)

}
