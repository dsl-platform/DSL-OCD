package com.dslplatform.ocd
package types

trait `type.S3`
    extends OcdType {

  type typeType = `type.S3`

  val typeClass = classOf[`type.S3`]

  val typeName = "S3"

  override val typeAliases = Set(
    "s3"
  )
}

case object `type.S3` extends `type.S3`
