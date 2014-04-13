package com.dslplatform.ocd

package types {
  trait OcdTypeValues {
    val values: IndexedSeq[OcdType] = IndexedSeq(
      `type.Binary`
    , `type.Bits`
    , `type.Boolean`
    , `type.Color`
    , `type.Date`
    , `type.Decimal`
    , `type.Decimal(9)`
    , `type.Double`
    , `type.Email`
    , `type.Float`
    , `type.Guid`
    , `type.Image`
    , `type.Integer`
    , `type.Ip`
    , `type.Json`
    , `type.JsonOf<Map>`
    , `type.Location`
    , `type.Long`
    , `type.Map`
    , `type.Money`
    , `type.Native`
    , `type.Phone`
    , `type.Point`
    , `type.Rectangle`
    , `type.S3`
    , `type.Secret`
    , `type.Stream`
    , `type.String`
    , `type.String(9)`
    , `type.Text`
    , `type.Time`
    , `type.Timestamp`
    , `type.Url`
    , `type.Xml`
    )
  }
}

package object types {
  type `type.BINARY` = `type.Binary`
  val  `type.BINARY` = `type.Binary`
  type `type.binary` = `type.Binary`
  val  `type.binary` = `type.Binary`

  type `type.BITS` = `type.Bits`
  val  `type.BITS` = `type.Bits`
  type `type.bits` = `type.Bits`
  val  `type.bits` = `type.Bits`

  type `type.BOOL` = `type.Boolean`
  val  `type.BOOL` = `type.Boolean`
  type `type.BOOLEAN` = `type.Boolean`
  val  `type.BOOLEAN` = `type.Boolean`
  type `type.Bool` = `type.Boolean`
  val  `type.Bool` = `type.Boolean`
  type `type.bool` = `type.Boolean`
  val  `type.bool` = `type.Boolean`
  type `type.boolean` = `type.Boolean`
  val  `type.boolean` = `type.Boolean`

  type `type.COLOR` = `type.Color`
  val  `type.COLOR` = `type.Color`
  type `type.color` = `type.Color`
  val  `type.color` = `type.Color`

  type `type.DATE` = `type.Date`
  val  `type.DATE` = `type.Date`
  type `type.date` = `type.Date`
  val  `type.date` = `type.Date`

  type `type.DECIMAL` = `type.Decimal`
  val  `type.DECIMAL` = `type.Decimal`
  type `type.decimal` = `type.Decimal`
  val  `type.decimal` = `type.Decimal`

  type `type.DECIMAL(9)` = `type.Decimal(9)`
  val  `type.DECIMAL(9)` = `type.Decimal(9)`
  type `type.decimal(9)` = `type.Decimal(9)`
  val  `type.decimal(9)` = `type.Decimal(9)`

  type `type.DOUBLE` = `type.Double`
  val  `type.DOUBLE` = `type.Double`
  type `type.double` = `type.Double`
  val  `type.double` = `type.Double`

  type `type.EMAIL` = `type.Email`
  val  `type.EMAIL` = `type.Email`
  type `type.email` = `type.Email`
  val  `type.email` = `type.Email`

  type `type.FLOAT` = `type.Float`
  val  `type.FLOAT` = `type.Float`
  type `type.float` = `type.Float`
  val  `type.float` = `type.Float`

  type `type.GUID` = `type.Guid`
  val  `type.GUID` = `type.Guid`
  type `type.UUID` = `type.Guid`
  val  `type.UUID` = `type.Guid`
  type `type.Uuid` = `type.Guid`
  val  `type.Uuid` = `type.Guid`
  type `type.guid` = `type.Guid`
  val  `type.guid` = `type.Guid`
  type `type.uuid` = `type.Guid`
  val  `type.uuid` = `type.Guid`

  type `type.IMAGE` = `type.Image`
  val  `type.IMAGE` = `type.Image`
  type `type.PICTURE` = `type.Image`
  val  `type.PICTURE` = `type.Image`
  type `type.Picture` = `type.Image`
  val  `type.Picture` = `type.Image`
  type `type.image` = `type.Image`
  val  `type.image` = `type.Image`
  type `type.picture` = `type.Image`
  val  `type.picture` = `type.Image`

  type `type.INT` = `type.Integer`
  val  `type.INT` = `type.Integer`
  type `type.INTEGER` = `type.Integer`
  val  `type.INTEGER` = `type.Integer`
  type `type.Int` = `type.Integer`
  val  `type.Int` = `type.Integer`
  type `type.int` = `type.Integer`
  val  `type.int` = `type.Integer`
  type `type.integer` = `type.Integer`
  val  `type.integer` = `type.Integer`

  type `type.IP` = `type.Ip`
  val  `type.IP` = `type.Ip`
  type `type.ip` = `type.Ip`
  val  `type.ip` = `type.Ip`

  type `type.JSON` = `type.Json`
  val  `type.JSON` = `type.Json`
  type `type.json` = `type.Json`
  val  `type.json` = `type.Json`

  type `type.JSONOF<MAP>` = `type.JsonOf<Map>`
  val  `type.JSONOF<MAP>` = `type.JsonOf<Map>`
  type `type.Jsonof<map>` = `type.JsonOf<Map>`
  val  `type.Jsonof<map>` = `type.JsonOf<Map>`
  type `type.jsonof<map>` = `type.JsonOf<Map>`
  val  `type.jsonof<map>` = `type.JsonOf<Map>`

  type `type.LOCATION` = `type.Location`
  val  `type.LOCATION` = `type.Location`
  type `type.location` = `type.Location`
  val  `type.location` = `type.Location`

  type `type.LONG` = `type.Long`
  val  `type.LONG` = `type.Long`
  type `type.long` = `type.Long`
  val  `type.long` = `type.Long`

  type `type.DICTIONARY` = `type.Map`
  val  `type.DICTIONARY` = `type.Map`
  type `type.Dictionary` = `type.Map`
  val  `type.Dictionary` = `type.Map`
  type `type.MAP` = `type.Map`
  val  `type.MAP` = `type.Map`
  type `type.dictionary` = `type.Map`
  val  `type.dictionary` = `type.Map`
  type `type.map` = `type.Map`
  val  `type.map` = `type.Map`

  type `type.MONEY` = `type.Money`
  val  `type.MONEY` = `type.Money`
  type `type.money` = `type.Money`
  val  `type.money` = `type.Money`

  type `type.NATIVE` = `type.Native`
  val  `type.NATIVE` = `type.Native`
  type `type.native` = `type.Native`
  val  `type.native` = `type.Native`

  type `type.PHONE` = `type.Phone`
  val  `type.PHONE` = `type.Phone`
  type `type.phone` = `type.Phone`
  val  `type.phone` = `type.Phone`

  type `type.POINT` = `type.Point`
  val  `type.POINT` = `type.Point`
  type `type.point` = `type.Point`
  val  `type.point` = `type.Point`

  type `type.BOX` = `type.Rectangle`
  val  `type.BOX` = `type.Rectangle`
  type `type.Box` = `type.Rectangle`
  val  `type.Box` = `type.Rectangle`
  type `type.RECTANGLE` = `type.Rectangle`
  val  `type.RECTANGLE` = `type.Rectangle`
  type `type.box` = `type.Rectangle`
  val  `type.box` = `type.Rectangle`
  type `type.rectangle` = `type.Rectangle`
  val  `type.rectangle` = `type.Rectangle`

  type `type.s3` = `type.S3`
  val  `type.s3` = `type.S3`

  type `type.SECRET` = `type.Secret`
  val  `type.SECRET` = `type.Secret`
  type `type.secret` = `type.Secret`
  val  `type.secret` = `type.Secret`

  type `type.STREAM` = `type.Stream`
  val  `type.STREAM` = `type.Stream`
  type `type.stream` = `type.Stream`
  val  `type.stream` = `type.Stream`

  type `type.STRING` = `type.String`
  val  `type.STRING` = `type.String`
  type `type.string` = `type.String`
  val  `type.string` = `type.String`

  type `type.STRING(9)` = `type.String(9)`
  val  `type.STRING(9)` = `type.String(9)`
  type `type.string(9)` = `type.String(9)`
  val  `type.string(9)` = `type.String(9)`

  type `type.TEXT` = `type.Text`
  val  `type.TEXT` = `type.Text`
  type `type.text` = `type.Text`
  val  `type.text` = `type.Text`

  type `type.TIME` = `type.Time`
  val  `type.TIME` = `type.Time`
  type `type.time` = `type.Time`
  val  `type.time` = `type.Time`

  type `type.DATETIME` = `type.Timestamp`
  val  `type.DATETIME` = `type.Timestamp`
  type `type.DateTime` = `type.Timestamp`
  val  `type.DateTime` = `type.Timestamp`
  type `type.Datetime` = `type.Timestamp`
  val  `type.Datetime` = `type.Timestamp`
  type `type.TIMESTAMP` = `type.Timestamp`
  val  `type.TIMESTAMP` = `type.Timestamp`
  type `type.datetime` = `type.Timestamp`
  val  `type.datetime` = `type.Timestamp`
  type `type.timestamp` = `type.Timestamp`
  val  `type.timestamp` = `type.Timestamp`

  type `type.LINK` = `type.Url`
  val  `type.LINK` = `type.Url`
  type `type.Link` = `type.Url`
  val  `type.Link` = `type.Url`
  type `type.URL` = `type.Url`
  val  `type.URL` = `type.Url`
  type `type.link` = `type.Url`
  val  `type.link` = `type.Url`
  type `type.url` = `type.Url`
  val  `type.url` = `type.Url`

  type `type.XML` = `type.Xml`
  val  `type.XML` = `type.Xml`
  type `type.xml` = `type.Xml`
  val  `type.xml` = `type.Xml`
}
