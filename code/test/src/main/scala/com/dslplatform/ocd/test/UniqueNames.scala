package com.dslplatform.ocd
package test

import java.util.concurrent.atomic.AtomicInteger
import scala.collection.mutable.HashMap

object UniqueNames {
  private val indices = HashMap.empty[String, Int]

  def apply(name: String) =
    indices synchronized {
      val index = indices.getOrElse(name, 0) + 1
      indices(name) = index
      name + index
    }
}
