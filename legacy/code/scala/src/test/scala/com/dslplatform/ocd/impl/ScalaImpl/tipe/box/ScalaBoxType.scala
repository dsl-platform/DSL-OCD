package com.dslplatform.ocd
package impl
package box

import types._

sealed trait ScalaBoxStub
    extends ScalaImpl {
}

trait ScalaOne         extends ScalaBoxStub with `box.One`
trait ScalaOpt         extends ScalaBoxStub with `box.Opt`
trait ScalaArray       extends ScalaBoxStub with `box.Array`
trait ScalaList        extends ScalaBoxStub with `box.List`
trait ScalaSet         extends ScalaBoxStub with `box.Set`
trait ScalaOptArray    extends ScalaBoxStub with `box.OptArray`
trait ScalaOptList     extends ScalaBoxStub with `box.OptList`
trait ScalaOptSet      extends ScalaBoxStub with `box.OptSet`
trait ScalaArrayOpt    extends ScalaBoxStub with `box.ArrayOpt`
trait ScalaListOpt     extends ScalaBoxStub with `box.ListOpt`
trait ScalaSetOpt      extends ScalaBoxStub with `box.SetOpt`
trait ScalaOptArrayOpt extends ScalaBoxStub with `box.OptArrayOpt`
trait ScalaOptListOpt  extends ScalaBoxStub with `box.OptListOpt`
trait ScalaOptSetOpt   extends ScalaBoxStub with `box.OptSetOpt`
