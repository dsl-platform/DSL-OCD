package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfOneXmls_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfOneXmls: IndexedSeq[scala.xml.Elem] = IndexedSeq.empty
  ) {

    require(oneListOfOneXmls ne null, "Null value was provided for property \"oneListOfOneXmls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneXmls") oneListOfOneXmls: IndexedSeq[scala.xml.Elem]
  ) =
    this( oneListOfOneXmls = if (oneListOfOneXmls == null) IndexedSeq.empty else oneListOfOneXmls)

}
