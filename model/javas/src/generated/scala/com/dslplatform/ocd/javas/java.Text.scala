package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaText
    extends OcdJavaBoxType
    with `type.Text` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Text`
    extends JavaText with `box.One` {

  val javaClass = "String"
  val javaType = JavaSimpleType("String")
  val javaDescription = "OneText"

  def defaultValue = SingleJavaValue("\"\"")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("\"\\\"\"")
  , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
  , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
  )

  val hasGenerics = false
}

case object `java.Text?`
    extends JavaText with `box.Nullable` {

  val javaClass = "String"
  val javaType = JavaSimpleType("String")
  val javaDescription = "NullableText"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("\"\"")
  , SingleJavaValue("\"\\\"\"")
  , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
  , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
  )

  val hasGenerics = false
}

case object `java.Text[]`
    extends JavaText with `box.OneArrayOfOne` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "OneArrayOfOneTexts"

  def defaultValue = SingleJavaValue("new String[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = false
}

case object `java.Text[]?`
    extends JavaText with `box.NullableArrayOfOne` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "NullableArrayOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = false
}

case object `java.Text?[]`
    extends JavaText with `box.OneArrayOfNullable` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "OneArrayOfNullableTexts"

  def defaultValue = SingleJavaValue("new String[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = false
}

case object `java.Text?[]?`
    extends JavaText with `box.NullableArrayOfNullable` {

  val javaClass = "String[]"
  val javaType = JavaSimpleType("String[]")
  val javaDescription = "NullableArrayOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ArrayOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = false
}

case object `java.List<Text>`
    extends JavaText with `box.OneListOfOne` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "OneListOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<String>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<Text>?`
    extends JavaText with `box.NullableListOfOne` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "NullableListOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<Text?>`
    extends JavaText with `box.OneListOfNullable` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "OneListOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<String>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.List<Text?>?`
    extends JavaText with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<String>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("String"))
  val javaDescription = "NullableListOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , ListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Text>`
    extends JavaText with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "OneSetOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.HashSet<String>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Text>?`
    extends JavaText with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "NullableSetOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Text?>`
    extends JavaText with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "OneSetOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.HashSet<String>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Text?>?`
    extends JavaText with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<String>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("String"))
  val javaDescription = "NullableSetOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("String",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , SetOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Text>`
    extends JavaText with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "OneQueueOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<String>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Text>?`
    extends JavaText with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "NullableQueueOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Text?>`
    extends JavaText with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "OneQueueOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<String>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Text?>?`
    extends JavaText with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<String>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("String"))
  val javaDescription = "NullableQueueOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("String",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , QueueOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Text>`
    extends JavaText with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "OneLinkedListOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<String>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Text>?`
    extends JavaText with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "NullableLinkedListOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Text?>`
    extends JavaText with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "OneLinkedListOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<String>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Text?>?`
    extends JavaText with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<String>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("String"))
  val javaDescription = "NullableLinkedListOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , LinkedListOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Text>`
    extends JavaText with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "OneStackOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.Stack<String>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Text>?`
    extends JavaText with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "NullableStackOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Text?>`
    extends JavaText with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "OneStackOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.Stack<String>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Text?>?`
    extends JavaText with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<String>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("String"))
  val javaDescription = "NullableStackOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("String",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , StackOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Text>`
    extends JavaText with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "OneVectorOfOneTexts"

  def defaultValue = SingleJavaValue("new java.util.Vector<String>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Text>?`
    extends JavaText with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "NullableVectorOfOneTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Text?>`
    extends JavaText with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "OneVectorOfNullableTexts"

  def defaultValue = SingleJavaValue("new java.util.Vector<String>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Text?>?`
    extends JavaText with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<String>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("String"))
  val javaDescription = "NullableVectorOfNullableTexts"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("String",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  , VectorOfJavaValues("String",
      SingleJavaValue("null")
    , SingleJavaValue("\"\"")
    , SingleJavaValue("\"\\\"\"")
    , SingleJavaValue("\"Quote: \\\", Solidus /, Backslash: \\\\, Aphos: ', Brackets: [] () {}\"")
    , SingleJavaValue("\"\\u0001\\u0002\\u0003\\u0004\\u0005\\u0006\\u0007\\b\\t\\n\\u000B\\f\\r\\u000E\\u000F\\u0010\\u0011\\u0012\\u0013\\u0014\\u0015\\u0016\\u0017\\u0018\\u0019\\u001A\\u001B\\u001C\\u001D\\u001E\\u001F !\\\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\\u0080\\u0081\\u0082\\u0083\\u0084\\u0085\\u0086\\u0087\\u0088\\u0089\\u008A\\u008B\\u008C\\u008D\\u008E\\u008F\\u0090\\u0091\\u0092\\u0093\\u0094\\u0095\\u0096\\u0097\\u0098\\u0099\\u009A\\u009B\\u009C\\u009D\\u009E\\u009F\\u00A0\\u00A1\\u00A2\\u00A3\\u00A4\\u00A5\\u00A6\\u00A7\\u00A8\\u00A9\\u00AA\\u00AB\\u00AC\\u00AD\\u00AE\\u00AF\\u00B0\\u00B1\\u00B2\\u00B3\\u00B4\\u00B5\\u00B6\\u00B7\\u00B8\\u00B9\\u00BA\\u00BB\\u00BC\\u00BD\\u00BE\\u00BF\\u00C0\\u00C1\\u00C2\\u00C3\\u00C4\\u00C5\\u00C6\\u00C7\\u00C8\\u00C9\\u00CA\\u00CB\\u00CC\\u00CD\\u00CE\\u00CF\\u00D0\\u00D1\\u00D2\\u00D3\\u00D4\\u00D5\\u00D6\\u00D7\\u00D8\\u00D9\\u00DA\\u00DB\\u00DC\\u00DD\\u00DE\\u00DF\\u00E0\\u00E1\\u00E2\\u00E3\\u00E4\\u00E5\\u00E6\\u00E7\\u00E8\\u00E9\\u00EA\\u00EB\\u00EC\\u00ED\\u00EE\\u00EF\\u00F0\\u00F1\\u00F2\\u00F3\\u00F4\\u00F5\\u00F6\\u00F7\\u00F8\\u00F9\\u00FA\\u00FB\\u00FC\\u00FD\\u00FE\\u00FF\\u0100\"")
    )
  )

  val hasGenerics = true
}
