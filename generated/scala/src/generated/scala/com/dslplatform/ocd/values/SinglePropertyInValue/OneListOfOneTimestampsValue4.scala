package com.dslplatform.ocd.values.SinglePropertyInValue

case class OneListOfOneTimestampsValue4 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime] = IndexedSeq.empty
  ) {

    require(oneListOfOneTimestamps ne null, "Null value was provided for property \"oneListOfOneTimestamps\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTimestamps)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTimestamps") oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime]
  ) =
    this( oneListOfOneTimestamps = if (oneListOfOneTimestamps == null) IndexedSeq.empty else oneListOfOneTimestamps)

}
