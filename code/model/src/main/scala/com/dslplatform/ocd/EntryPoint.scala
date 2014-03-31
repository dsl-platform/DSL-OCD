package com.dslplatform.ocd

import generators._

object EntryPoint
    extends App {

  Types.generate()
  Boxes.generate()

  Dsls.generate()

  Javas.generate()
  JavaAsserts.generate()

  Scalas.generate()
}
