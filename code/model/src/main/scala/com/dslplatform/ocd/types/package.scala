package com.dslplatform.ocd

package types {
  trait OcdType {
    def typeName: String

    def typeAliases: Set[String]
  }

  object OcdType {
    val values: IndexedSeq[OcdType] = IndexedSeq(
      `type.Binary`
    , `type.Bool`
    , `type.Color`
    , `type.Date`
    , `type.Decimal`
    , `type.Double`
    , `type.Float`
    , `type.Guid`
    , `type.Image`
    , `type.Integer`
    , `type.IP`
    , `type.Json`
    , `type.Key-Value`
    , `type.Location`
    , `type.Long`
    , `type.Money`
    , `type.Native`
    , `type.Point`
    , `type.Rectangle`
    , `type.S3`
    , `type.Secret`
    , `type.String`
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

  type `type.BOOL` = `type.Bool`
  val  `type.BOOL` = `type.Bool`
  type `type.BOOLEAN` = `type.Bool`
  val  `type.BOOLEAN` = `type.Bool`
  type `type.Boolean` = `type.Bool`
  val  `type.Boolean` = `type.Bool`
  type `type.bool` = `type.Bool`
  val  `type.bool` = `type.Bool`
  type `type.boolean` = `type.Bool`
  val  `type.boolean` = `type.Bool`

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

  type `type.DOUBLE` = `type.Double`
  val  `type.DOUBLE` = `type.Double`
  type `type.double` = `type.Double`
  val  `type.double` = `type.Double`

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

  type `type.ip` = `type.IP`
  val  `type.ip` = `type.IP`

  type `type.JSON` = `type.Json`
  val  `type.JSON` = `type.Json`
  type `type.json` = `type.Json`
  val  `type.json` = `type.Json`

  type `type.DICTIONARY` = `type.Key-Value`
  val  `type.DICTIONARY` = `type.Key-Value`
  type `type.Dictionary` = `type.Key-Value`
  val  `type.Dictionary` = `type.Key-Value`
  type `type.KEY-VALUE` = `type.Key-Value`
  val  `type.KEY-VALUE` = `type.Key-Value`
  type `type.MAP` = `type.Key-Value`
  val  `type.MAP` = `type.Key-Value`
  type `type.Map` = `type.Key-Value`
  val  `type.Map` = `type.Key-Value`
  type `type.dictionary` = `type.Key-Value`
  val  `type.dictionary` = `type.Key-Value`
  type `type.key-value` = `type.Key-Value`
  val  `type.key-value` = `type.Key-Value`
  type `type.map` = `type.Key-Value`
  val  `type.map` = `type.Key-Value`

  type `type.LOCATION` = `type.Location`
  val  `type.LOCATION` = `type.Location`
  type `type.location` = `type.Location`
  val  `type.location` = `type.Location`

  type `type.BIGINT` = `type.Long`
  val  `type.BIGINT` = `type.Long`
  type `type.BigInt` = `type.Long`
  val  `type.BigInt` = `type.Long`
  type `type.LONG` = `type.Long`
  val  `type.LONG` = `type.Long`
  type `type.bigint` = `type.Long`
  val  `type.bigint` = `type.Long`
  type `type.long` = `type.Long`
  val  `type.long` = `type.Long`

  type `type.MONEY` = `type.Money`
  val  `type.MONEY` = `type.Money`
  type `type.money` = `type.Money`
  val  `type.money` = `type.Money`

  type `type.NATIVE` = `type.Native`
  val  `type.NATIVE` = `type.Native`
  type `type.native` = `type.Native`
  val  `type.native` = `type.Native`

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

  type `type.STRING` = `type.String`
  val  `type.STRING` = `type.String`
  type `type.TEXT` = `type.String`
  val  `type.TEXT` = `type.String`
  type `type.Text` = `type.String`
  val  `type.Text` = `type.String`
  type `type.string` = `type.String`
  val  `type.string` = `type.String`
  type `type.text` = `type.String`
  val  `type.text` = `type.String`

  type `type.DATETIME` = `type.Timestamp`
  val  `type.DATETIME` = `type.Timestamp`
  type `type.DateTime` = `type.Timestamp`
  val  `type.DateTime` = `type.Timestamp`
  type `type.TIMESTAMP` = `type.Timestamp`
  val  `type.TIMESTAMP` = `type.Timestamp`
  type `type.datetime` = `type.Timestamp`
  val  `type.datetime` = `type.Timestamp`
  type `type.timestamp` = `type.Timestamp`
  val  `type.timestamp` = `type.Timestamp`

  type `type.URL` = `type.Url`
  val  `type.URL` = `type.Url`
  type `type.url` = `type.Url`
  val  `type.url` = `type.Url`

  type `type.XML` = `type.Xml`
  val  `type.XML` = `type.Xml`
  type `type.xml` = `type.Xml`
  val  `type.xml` = `type.Xml`
}
