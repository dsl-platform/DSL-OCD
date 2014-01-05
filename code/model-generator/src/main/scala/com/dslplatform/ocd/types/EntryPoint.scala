package com.dslplatform.ocd.types

import scala.collection.mutable.LinkedHashSet
import scalax.file._

object EntryPoint
    extends App {

  Types.generate()
  Boxes.generate()
  DSLs.generate()
}
