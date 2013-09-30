package com.dslplatform.ocd

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

  def apply(dslType: String) = {
    dslType match {
      case `(.+)?[]?`    (tipe) => DslOptArrOptRaw(tipe)
      case `List<(.+)?>?`(tipe) => DslOptListOptRaw(tipe)
      case `Set<(.+)?>?` (tipe) => DslOptSetOptRaw(tipe)

      case `(.+)?[]`     (tipe) => DslArrOptRaw(tipe)
      case `List<(.+)?>` (tipe) => DslListOptRaw(tipe)
      case `Set<(.+)?>`  (tipe) => DslSetOptRaw(tipe)

      case `(.+)[]?`     (tipe) => DslOptArrRaw(tipe)
      case `List<(.+)>?` (tipe) => DslOptListRaw(tipe)
      case `Set<(.+)>?`  (tipe) => DslOptSetRaw(tipe)

      case `(.+)[]`      (tipe) => DslOneRaw(tipe)
      case `(.+)?`       (tipe) => DslOptRaw(tipe)
      case `(.+)`        (tipe) => DslArrRaw(tipe)
    }
  }
}

trait DslRawStub
    extends DslTypeImplStub
    with TipeUnconstrainedType

case class DslOneRaw(dslType: String)        extends DslRawStub with DslOneImpl
case class DslOptRaw(dslType: String)        extends DslRawStub with DslOptImpl
case class DslArrRaw(dslType: String)        extends DslRawStub with DslArrImpl

case class DslOptArrRaw(dslType: String)     extends DslRawStub with DslOptArrImpl
case class DslOptListRaw(dslType: String)    extends DslRawStub with DslOptListImpl
case class DslOptSetRaw(dslType: String)     extends DslRawStub with DslOptSetImpl

case class DslArrOptRaw(dslType: String)     extends DslRawStub with DslArrOptImpl
case class DslListOptRaw(dslType: String)    extends DslRawStub with DslListOptImpl
case class DslSetOptRaw(dslType: String)     extends DslRawStub with DslSetOptImpl

case class DslOptArrOptRaw(dslType: String)  extends DslRawStub with DslOptArrOptImpl
case class DslOptListOptRaw(dslType: String) extends DslRawStub with DslOptListOptImpl
case class DslOptSetOptRaw(dslType: String)  extends DslRawStub with DslOptSetOptImpl
