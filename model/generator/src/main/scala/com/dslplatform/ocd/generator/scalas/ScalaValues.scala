package com.dslplatform.ocd
package generator
package scalas

import scalatypes._

trait ScalaValues {
  val stubs = Map(
    "Binary" -> ScalaBinary
  , "Boolean" -> ScalaBool
  , "Date" -> ScalaDate
  , "Decimal" -> ScalaDecimal
  , "Decimal(9)" -> ScalaDecimalWithScale
  , "Double" -> ScalaDouble
  , "Float" -> ScalaFloat
  , "Guid" -> ScalaGuid
  , "Image" -> ScalaImage
  , "Integer" -> ScalaInteger
  , "Ip" -> ScalaIp
  , "Location" -> ScalaLocation
  , "Long" -> ScalaLong
  , "Map" -> ScalaMap
  , "Money" -> ScalaMoney
  , "Point" -> ScalaPoint
  , "Rectangle" -> ScalaRectangle
  , "String" -> ScalaString
  , "String(9)" -> ScalaStringWithMaxLength
  , "Text" -> ScalaText
  , "Timestamp" -> ScalaTimestamp
  , "Url" -> ScalaUrl
  , "Xml" -> ScalaXml
  )
}
