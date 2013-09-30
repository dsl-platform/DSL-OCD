package com.dslplatform.ocd

trait OcdType {
  val dslType: String
  val javaType: String
}

object OcdType {
  val values = Seq(
    OcdBool
  , OcdInt
  , OcdString
  )
}

object OcdBool extends OcdType {
  val dslType = "Bool"
  val javaType = "boolean"
}

object OcdInt extends OcdType {
  val dslType = "Int"
  val javaType = "int"
}

object OcdString extends OcdType {
  val dslType = "String"
  val javaType = "String"
}
