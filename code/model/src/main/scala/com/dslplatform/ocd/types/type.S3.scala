package com.dslplatform.ocd
package types

trait `type.S3`
    extends OcdType {

  def typeName = "S3"

  def typeAliases = Set(
    "s3"
  )
}

case object `type.S3` extends `type.S3`
