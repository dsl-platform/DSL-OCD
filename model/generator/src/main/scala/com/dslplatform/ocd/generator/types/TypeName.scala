package com.dslplatform.ocd
package generator
package types

case class TypeName(
    dslName: String
  , singleName: String
  , pluralName: String) {
  def typeNameSafe = dslName.replaceAll("[^-\\w]+", "")
}

object TypeName {
  def apply(name: String): TypeName =
    apply(name, name + "s")

  def apply(singleName: String, pluralName: String): TypeName =
    TypeName(singleName, singleName, pluralName)
}

object Type {
   def apply(shortName: String, name: String, aliases: String*): Type =
    Type(shortName, TypeName(name), aliases.map(TypeName(_)))
}

case class Type(shortName: String, name: TypeName, aliases: Seq[TypeName] = Nil) {
  def derivedAliases =
    (name +: aliases) map(_.dslName) flatMap( n => Set(
      n
    , n.toUpperCase
    , n.toLowerCase
    , n.head.toUpper + n.tail.toLowerCase
    )) sortBy(identity) filterNot(name.dslName ==)
}
