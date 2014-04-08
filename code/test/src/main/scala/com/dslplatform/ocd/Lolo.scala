package com.dslplatform.ocd

import config.ITestDeployer

import javas.turtle._
import test.javatest.property.turtle._

//import test.aggregates._
//import test.values._

object Lolo extends App {
    import boxes._
    import types._
    import javas._

    def buildOneOcdJavaValue(clazz: String, propertyName: String, ocdJava: OcdJava) =
      new OcdJava with `box.One` with `type.Guid` {
        val javaClass = "com.dslplatform.ocd.javas.Pero"
        val javaType = JavaClass(javaClass)

        def defaultValue = SingleJavaValue(
          s"new ${javaClass}()"
        , ocdJava.defaultValue.stability
        )

        def nonDefaultValues = ocdJava.nonDefaultValues map { ndv =>
          SingleJavaValue(
            s"new ${javaClass}().set${propertyName.fciu}(${ocdJava.nonDefaultValues})"
          , ocdJava.defaultValue.stability
          )
        }

        val isPrecise = ocdJava.isPrecise
        val isPrimitive = false
        val hasGenerics = ocdJava.hasGenerics
      }

    sys.exit(0)
}
