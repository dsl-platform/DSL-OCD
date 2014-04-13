package com.dslplatform.ocd
package generator

object EntryPoint
    extends App {

  Seq(
    boxes.BoxGenerator
  , types.TypeGenerator
  , dsls.DslBoxTypeGenerator
  , javas.JavaGenerator
  , javas.JavaAssertGenerator
  , scalas.ScalaGenerator
  ).par.foreach(_.generate)
}
