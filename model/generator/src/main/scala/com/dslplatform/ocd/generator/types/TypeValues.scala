package com.dslplatform.ocd
package generator
package types

import TypeDefaults._

trait TypeValues {
  val typeValues = Seq(
    Type(TypeName("Binary", "Binaries"))
  , Type(TypeName("Bits", "Bitses"))
  , Type("Boolean", "Bool")
  , Type("Color")
  , Type("Date")
  , Type("Decimal")
  , Type(TypeName(s"Decimal(${DefaultDecimalScale})", s"DecimalWithScaleOf${DefaultDecimalScale}", s"DecimalsWithScaleOf${DefaultDecimalScale}"))
  , Type("Double")
  , Type("Email")
  , Type("Float")
  , Type("Guid", "Uuid")
  , Type("Image", "Picture")
  , Type("Integer", "Int")
  , Type("Ip")
  , Type("Json")
  , Type(TypeName(s"JsonOf<${DefaultJsonOfType}>", s"JsonOf${DefaultJsonOfType}Kind", s"JsonsOf${DefaultJsonOfType}Kind"))
  , Type("Location")
  , Type("Long")
  , Type("Map", "Dictionary")
  , Type(TypeName("Money", "Monies"))
  , Type("Native")
  , Type("Phone")
  , Type("Point")
  , Type("Rectangle", "Box")
  , Type("S3")
  , Type("Secret")
  , Type("Stream")
  , Type("String")
  , Type(TypeName(s"String(${DefaultStringLength})", s"StringWithMaxLengthOf${DefaultStringLength}", s"StringsWithMaxLengthOf${DefaultStringLength}"))
  , Type("Text")
  , Type("Time")
  , Type("Timestamp", "DateTime")
  , Type("Url", "Link")
  , Type("Xml")
  )
}
