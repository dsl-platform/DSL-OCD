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
  , "Point" -> JavaPoint
  , "Rectangle" -> JavaRectangle
  , "String" -> JavaString
  , "String(9)" -> JavaStringWithMaxLength
  , "Text" -> JavaText
  , "Timestamp" -> JavaTimestamp
  , "Url" -> JavaUrl
  , "Xml" -> JavaXml
  )
}
