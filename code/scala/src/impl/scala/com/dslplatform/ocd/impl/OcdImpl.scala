package com.dslplatform.ocd

package object impl {
  implicit class ImpaleStringOps(val name: String)
      extends AnyVal with Dynamic {
    def fciu = name.head.toUpper + name.tail
    def fcil = name.head.toLower + name.tail

    def tab = name.split("\n").map("  " +).mkString("\n")
  }

  import dsl._

  implicit def stringToStringlyPropertyComponent(component: String) =
    new StringlyTypedDslPropertyComponent(component)

  implicit def stringToStringlyPropertyComponent(component: (String, String)) = {
    val tipe = DslRaw.extract(component._1)

    new DslProperty(tipe, component._2, None) {
      def apply(_components: dsl.DslPropertyComponent*) =
        new DslProperty(tipe, name, Some(_components))
    }
  }
}

package impl {
  trait OcdImpl
}
