package com.dslplatform

import java.util.Locale

package object ocd
    extends com.github.nscala_time.time.Imports
    with io.jvm.uuid.Imports
    with scala.collection.convert.DecorateAsScala {

  type Logger = org.slf4j.Logger
  type Properties = java.util.Properties

  type MMap[K, V] = scala.collection.mutable.LinkedHashMap[K, V]

  type Files = Map[String, String]
  type MFiles = MMap[String, String]

  type File = better.files.File
  val File = better.files.File

  val XKCD = config.XKCD
  val Workspace = config.Workspace

  type Random = scala.util.Random
  type Regex = scala.util.matching.Regex

  implicit class RichBoolean(val value: Boolean) extends AnyVal {
    def ifTrue(trueText: String, falseText: String = "") = if (value) trueText else falseText
  }

  implicit class RichString(val value: String) extends AnyVal {
    def fciu = value.head.toUpper + value.tail
    def fcil = value.head.toLower + value.tail
  }

  implicit class RichLanguage(val language: Language) extends AnyVal {
    def lowerName = language.name.toLowerCase(Locale.ENGLISH)
  }
}

package ocd {
  sealed trait Language {
    def name: String
  }
  case object JAVA extends Language {
    val name = "java_client"
    override val toString = name
  }
}
