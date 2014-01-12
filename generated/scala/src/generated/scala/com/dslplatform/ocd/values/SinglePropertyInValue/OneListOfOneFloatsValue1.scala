package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneFloatsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneFloats: IndexedSeq[Float] = IndexedSeq.empty
  ) {

    require(oneListOfOneFloats ne null, "Null value was provided for property \"oneListOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneFloats") oneListOfOneFloats: IndexedSeq[Float]
  ) =
    this( oneListOfOneFloats = if (oneListOfOneFloats == null) IndexedSeq.empty else oneListOfOneFloats)

}
