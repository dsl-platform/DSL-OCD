package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfOneFloatsValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneFloats: Option[Set[Float]] = None
  ) {

    require(nullableSetOfOneFloats ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")
    if (nullableSetOfOneFloats.isDefined) require(nullableSetOfOneFloats.get ne null, "Null value was provided for property \"nullableSetOfOneFloats\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneFloats") nullableSetOfOneFloats: Option[Set[Float]]
  ) =
    this( nullableSetOfOneFloats = nullableSetOfOneFloats)

}
