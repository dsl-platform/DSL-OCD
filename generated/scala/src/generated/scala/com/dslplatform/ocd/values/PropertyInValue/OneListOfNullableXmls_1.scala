package com.dslplatform.ocd.values.PropertyInValue

case class OneListOfNullableXmls_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]] = IndexedSeq.empty
  ) {

    require(oneListOfNullableXmls ne null, "Null value was provided for property \"oneListOfNullableXmls\"")
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableXmls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableXmls") oneListOfNullableXmls: IndexedSeq[Option[scala.xml.Elem]]
  ) =
    this( oneListOfNullableXmls = if (oneListOfNullableXmls == null) IndexedSeq.empty else oneListOfNullableXmls)

}
