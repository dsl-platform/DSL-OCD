package com.dslplatform.ocd
package test

import scala.collection.mutable.HashMap

object UniqueNames {
  private val indices = HashMap.empty[String, Int]

  def apply(name: String*) =
    nextInt(name: _*) match {
      case 1 => name.last
      case x => name.last + "_" + x
    }

  def nextInt(name: String*) =
    indices synchronized {
      val ID = name.map(_.replace("\\", "\\\\").replace("\"", "\\\"")).mkString("\"", "\",\"", "\"")

      val index = indices.getOrElse(ID, 0) + 1
      indices(ID) = index
      index
    }
}
