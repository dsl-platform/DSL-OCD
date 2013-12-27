package com.dslplatform.ocd
package impl
package box

import types._

sealed trait JavaBoxStub
    extends JavaImpl {

  def javaClass: String
//  def constructor: String
//  def defaultValue: String
}

trait JavaOne         extends JavaBoxStub with `box.One`
trait JavaOpt         extends JavaBoxStub with `box.Opt`
trait JavaArray       extends JavaBoxStub with `box.Array`
trait JavaList        extends JavaBoxStub with `box.List`
trait JavaSet         extends JavaBoxStub with `box.Set`
trait JavaOptArray    extends JavaBoxStub with `box.OptArray`
trait JavaOptList     extends JavaBoxStub with `box.OptList`
trait JavaOptSet      extends JavaBoxStub with `box.OptSet`
trait JavaArrayOpt    extends JavaBoxStub with `box.ArrayOpt`
trait JavaListOpt     extends JavaBoxStub with `box.ListOpt`
trait JavaSetOpt      extends JavaBoxStub with `box.SetOpt`
trait JavaOptArrayOpt extends JavaBoxStub with `box.OptArrayOpt`
trait JavaOptListOpt  extends JavaBoxStub with `box.OptListOpt`
trait JavaOptSetOpt   extends JavaBoxStub with `box.OptSetOpt`
