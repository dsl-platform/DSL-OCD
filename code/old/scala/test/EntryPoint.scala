package test

import com.dslplatform.ocd.impl._
import java.test._

object EntryPoint extends App {

  val a = new TestOneBoolInValueJava { def packageStub = "com.xxx" }

  println(a.dslTemplate)
  println(a.javaTemplate)

  sys.exit(0)

  val bins = Seq(
    `java.Binary`
  , `java.Binary?`
  , `java.Binary[]`
  , `java.List<Binary>`
  , `java.Set<Binary>`
  , `java.Binary[]?`
  , `java.List<Binary>?`
  , `java.Set<Binary>?`
  , `java.Binary?[]`
  , `java.List<Binary?>`
  , `java.Set<Binary?>`
  , `java.Binary?[]?`
  , `java.List<Binary?>?`
  , `java.Set<Binary?>?`
  )

  println("----> %20s - %35s = %35s - %35s" format("box", "defaultValue", "constructor", "javaClass"))
  println("-" * 80)

  bins foreach { b =>
    println("----> %20s = %35s = %30s - %35s" format(b, b.defaultValue, b.constructor, b.javaClass))
  }

}
