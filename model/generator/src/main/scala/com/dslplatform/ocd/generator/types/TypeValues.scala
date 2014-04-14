package com.dslplatform.ocd
package generator
package types

import TypeDefaults._

trait TypeValues {
  val typeValues = Seq(
    Type("Bi", TypeName("Binary", "Binaries"))
  , Type("Bt", TypeName("Bits", "Bitses"))
  , Type("Bo", "Boolean", "Bool")
  , Type("Co", "Color")
  , Type("Da", "Date")
  , Type("De", "Decimal")
  , Type(s"D${DefaultDecimalScale}", TypeName(s"Decimal(${DefaultDecimalScale})", s"DecimalWithScaleOf${DefaultDecimalScale}", s"DecimalsWithScaleOf${DefaultDecimalScale}"))
  , Type("Do", "Double")
  , Type("Em", "Email")
  , Type("Fl", "Float")
  , Type("Gu", "Guid", "Uuid")
  , Type("Im", "Image", "Picture")
  , Type("In", "Integer", "Int")
  , Type("Ip", "Ip")
  , Type("Js", "Json")
  , Type(s"J${DefaultJsonOfType.head}", TypeName(s"JsonOf<${DefaultJsonOfType}>", s"JsonOf${DefaultJsonOfType}Kind", s"JsonsOf${DefaultJsonOfType}Kind"))
  , Type("Lc", "Location")
  , Type("Lo", "Long")
  , Type("Ma", "Map", "Dictionary")
  , Type("Mo", TypeName("Money", "Monies"))
  , Type("Na", "Native")
  , Type("Ph", "Phone")
  , Type("Po", "Point")
  , Type("Re", "Rectangle", "Box")
  , Type("S3", "S3")
  , Type("Se", "Secret")
  , Type("Sm", "Stream")
  , Type("St", "String")
  , Type(s"S${DefaultStringLength}", TypeName(s"String(${DefaultStringLength})", s"StringWithMaxLengthOf${DefaultStringLength}", s"StringsWithMaxLengthOf${DefaultStringLength}"))
  , Type("Te", "Text")
  , Type("Tm", "Time")
  , Type("Ts", "Timestamp", "DateTime")
  , Type("Ur", "Url", "Link")
  , Type("Xm", "Xml")
  )
}
