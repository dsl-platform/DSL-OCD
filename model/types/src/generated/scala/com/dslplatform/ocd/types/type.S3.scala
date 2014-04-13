package com.dslplatform.ocd
package types

trait `type.S3`
    extends OcdType {

  type typeType = `type.S3`
  val typeClass = classOf[`type.S3`]

  val typeName = "S3"
  val typeNameSafe = "S3"

  val typeSingleName = "S3"
  val typePluralName = "S3s"

  override val typeAliases = Set(
    "s3"
  )
}

case object `type.S3` extends `type.S3`
