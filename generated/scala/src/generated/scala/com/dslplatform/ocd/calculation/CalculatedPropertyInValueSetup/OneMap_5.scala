package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup

case class OneMap_5 @com.fasterxml.jackson.annotation.JsonIgnore() (
     oneMap: Map[String, String] = Map.empty[String, String],
     calculatedOneMap: Map[String, String] = Map.empty[String, String],
     persistedOneMap: Map[String, String] = Map.empty[String, String]
  ) {

    require(oneMap ne null, "Null value was provided for property \"oneMap\"")

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("oneMap") oneMap: Map[String, String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneMap") calculatedOneMap: Map[String, String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneMap") persistedOneMap: Map[String, String]
  ) =
    this( oneMap = if (oneMap == null) Map.empty[String, String] else oneMap, calculatedOneMap = if (calculatedOneMap == null) Map.empty[String, String] else calculatedOneMap, persistedOneMap = if (persistedOneMap == null) Map.empty[String, String] else persistedOneMap)

}
