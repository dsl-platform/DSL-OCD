package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableLongValue2 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableLong: Option[Long] = None
  ) {

    require(nullableLong ne null, "Null value was provided for property \"nullableLong\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableLong") nullableLong: Option[Long]
  ) =
    this( nullableLong = nullableLong)

}
