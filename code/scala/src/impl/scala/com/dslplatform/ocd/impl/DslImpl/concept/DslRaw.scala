package com.dslplatform.ocd
package impl
package dsl

object DslRaw {
  private val `(.+)`         = """^(\w+)$"""r
  private val `(.+)?`        = """^(\w+)\?$"""r
  private val `(.+)[]`       = """^(\w+)\[\]$"""r
  private val `List<(.+)>`   = """^List\<(\w+)\>$"""r
  private val `Set<(.+)>`    = """^Set\<(\w+)\>$"""r
  private val `(.+)[]?`      = """^(\w+)\[\]\?$"""r
  private val `List<(.+)>?`  = """^List\<(\w+)\>\?$"""r
  private val `Set<(.+)>?`   = """^Set\<(\w+)\>\?$"""r
  private val `(.+)?[]`      = """^(\w+)\?\[\]$"""r
  private val `List<(.+)?>`  = """^List\<(\w+)\?\>$"""r
  private val `Set<(.+)?>`   = """^Set\<(\w+)\?\>$"""r
  private val `(.+)?[]?`     = """^(\w+)\?\[\]\?$"""r
  private val `List<(.+)?>?` = """^List\<(\w+)\?\>\?$"""r
  private val `Set<(.+)?>?`  = """^Set\<(\w+)\?\>\?$"""r

  def extract(dslDesc: String): DslRawStub = {
    dslDesc match {
      case `(.+)?[]?`    (tipe) => DslOptArrOptRaw(tipe)
      case `List<(.+)?>?`(tipe) => DslOptListOptRaw(tipe)
      case `Set<(.+)?>?` (tipe) => DslOptSetOptRaw(tipe)

      case `(.+)?[]`     (tipe) => DslArrOptRaw(tipe)
      case `List<(.+)?>` (tipe) => DslListOptRaw(tipe)
      case `Set<(.+)?>`  (tipe) => DslSetOptRaw(tipe)

      case `(.+)[]?`     (tipe) => DslOptArrRaw(tipe)
      case `List<(.+)>?` (tipe) => DslOptListRaw(tipe)
      case `Set<(.+)>?`  (tipe) => DslOptSetRaw(tipe)

      case `(.+)[]`      (tipe) => DslArrRaw(tipe)
      case `(.+)?`       (tipe) => DslOptRaw(tipe)
      case `(.+)`        (tipe) => DslOneRaw(tipe)
    }
  }
}

import types._
import tipe._

trait DslRawStub
    extends DslImpl
    with TipeUnconstrainedType {

  def tipeDesc = dslDesc
}

case class DslOneRaw(dslDesc: String)        extends DslRawStub with `box.One`
case class DslOptRaw(dslDesc: String)        extends DslRawStub with `box.Opt`
case class DslArrRaw(dslDesc: String)        extends DslRawStub with `box.Array`

case class DslOptArrRaw(dslDesc: String)     extends DslRawStub with `box.OptArray`
case class DslOptListRaw(dslDesc: String)    extends DslRawStub with `box.OptList`
case class DslOptSetRaw(dslDesc: String)     extends DslRawStub with `box.OptSet`

case class DslArrOptRaw(dslDesc: String)     extends DslRawStub with `box.ArrayOpt`
case class DslListOptRaw(dslDesc: String)    extends DslRawStub with `box.ListOpt`
case class DslSetOptRaw(dslDesc: String)     extends DslRawStub with `box.SetOpt`

case class DslOptArrOptRaw(dslDesc: String)  extends DslRawStub with `box.OptArrayOpt`
case class DslOptListOptRaw(dslDesc: String) extends DslRawStub with `box.OptListOpt`
case class DslOptSetOptRaw(dslDesc: String)  extends DslRawStub with `box.OptSetOpt`
