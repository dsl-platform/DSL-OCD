package com.dslplatform.ocd
package generator
package javas

import javatypes._

trait JavaValues {
  val stubs = Map(
    "Binary" -> JavaBinary
  , "Boolean" -> JavaBool
  , "Date" -> JavaDate
  , "Decimal" -> JavaDecimal
  , "Decimal(9)" -> JavaDecimalWithScale
  , "Double" -> JavaDouble
  , "Float" -> JavaFloat
  , "Guid" -> JavaGuid
  , "Image" -> JavaImage
  , "Integer" -> JavaInteger
  , "Ip" -> JavaIp
  , "Location" -> JavaLocation
  , "Long" -> JavaLong
  , "Map" -> JavaMap
  , "Money" -> JavaMoney
  , "Path" -> JavaPath
  , "Point" -> JavaPoint
  , "Properties" -> JavaProperties
  , "Rectangle" -> JavaRectangle
  , "Short" -> JavaShort
  , "String" -> JavaString
  , "String(9)" -> JavaStringWithMaxLength
  , "Text" -> JavaText
  , "Timestamp" -> JavaTimestamp
  , "Url" -> JavaUrl
  , "Xml" -> JavaXml
  )
}
