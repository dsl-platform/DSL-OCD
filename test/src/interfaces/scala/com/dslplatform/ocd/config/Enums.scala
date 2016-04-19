package com.dslplatform.ocd.config

import java.util.NoSuchElementException

trait Enum {
  val name = this.toString
}

trait EnumObj[T <: Enum] {
  val values: IndexedSeq[T]
  def enumName = this.getClass.getSimpleName.stripSuffix("$")
  def find(name: String): T = {
    values.find(_.name.toLowerCase == name.toLowerCase).getOrElse {
      throw new NoSuchElementException(s"Element named '$name' in enum '$enumName' not found! Available elements: " + values.mkString(", "))
    }
  }
  override def toString = enumName
}

sealed trait Revenj extends Enum {
  val templateName: String
  val configName: String
}
object Revenj extends EnumObj[Revenj] {
  case object DotNet extends Revenj {
    val templateName = "revenj.net"
    val configName = "Revenj.Http.exe.config.template"
  }
  case object Java extends Revenj {
    val templateName = "revenj.java"
    val configName = "revenj.properties.template"
  }
  val values = IndexedSeq(DotNet, Java)
}

sealed trait Database extends Enum { val templateName: String }
object Database extends EnumObj[Database] {
  case object PostgreSQL extends Database { val templateName = "postgres" }
  case object Oracle     extends Database { val templateName = "oracle"   }
  val values = IndexedSeq(PostgreSQL, Oracle)
}
