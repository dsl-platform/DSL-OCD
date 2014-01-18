package com.dslplatform.ocd.values.PropertyInValue

case class NullableSetOfOneUrls_1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfOneUrls: Option[Set[java.net.URI]] = None
  ) {

    require(nullableSetOfOneUrls ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    if (nullableSetOfOneUrls.isDefined) require(nullableSetOfOneUrls.get ne null, "Null value was provided for property \"nullableSetOfOneUrls\"")
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneUrls)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneUrls") nullableSetOfOneUrls: Option[Set[java.net.URI]]
  ) =
    this( nullableSetOfOneUrls = nullableSetOfOneUrls)

}
