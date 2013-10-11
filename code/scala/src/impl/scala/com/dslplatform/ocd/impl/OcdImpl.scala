package com.dslplatform.ocd

import com.dslplatform.ocd.impl.dsl.DslPropertyComponent

package object impl {
  implicit class ImpaleStringOps(val name: String)
      extends AnyVal with Dynamic {
    def fciu = name.head.toUpper + name.tail
    def fcil = name.head.toLower + name.tail

    def tab = name.split("\n").map("  " +).mkString("\n")
  }

  implicit def StringToStringlyPropertyComponent(component: String) =
    new impl.dsl.StringlyTypedDslPropertyComponent(component)

  implicit def StringToStringlyPropertyComponent(component: (String, String)) = {
    val tipe = "" + dsl.DslRaw.extract(component._1)

    new DslProperty(tipe, component._2, None) {
      def apply(_components: DslPropertyComponent*) =
        new DslProperty(tipe, name, Some(_components))
    }
  }
}

package impl {
  trait OcdImpl
}
