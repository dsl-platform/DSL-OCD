package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneArrayOfOneGuids_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneArrayOfOneGuids: Array[java.util.UUID] = Array.empty,
     calculatedOneArrayOfOneGuids: Array[java.util.UUID] = Array.empty,
     persistedOneArrayOfOneGuids: Array[java.util.UUID] = Array.empty
  ) {

    require(oneArrayOfOneGuids ne null, "Null value was provided for property \"oneArrayOfOneGuids\"")
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneGuids)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneGuids") oneArrayOfOneGuids: Array[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneGuids") calculatedOneArrayOfOneGuids: Array[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneGuids") persistedOneArrayOfOneGuids: Array[java.util.UUID]
  ) =
    this( oneArrayOfOneGuids = if (oneArrayOfOneGuids == null) Array.empty else oneArrayOfOneGuids, calculatedOneArrayOfOneGuids = calculatedOneArrayOfOneGuids, persistedOneArrayOfOneGuids = persistedOneArrayOfOneGuids)

}
