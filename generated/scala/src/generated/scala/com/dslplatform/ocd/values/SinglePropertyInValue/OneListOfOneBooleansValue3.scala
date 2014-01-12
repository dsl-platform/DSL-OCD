package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneBooleansValue3 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneBooleans: IndexedSeq[Boolean] = IndexedSeq.empty
  ) {

    require(oneListOfOneBooleans ne null, "Null value was provided for property \"oneListOfOneBooleans\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBooleans") oneListOfOneBooleans: IndexedSeq[Boolean]
  ) =
    this( oneListOfOneBooleans = if (oneListOfOneBooleans == null) IndexedSeq.empty else oneListOfOneBooleans)

}
