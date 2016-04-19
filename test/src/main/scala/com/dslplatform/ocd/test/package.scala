package com.dslplatform.ocd

import com.dslplatform.ocd.config.{Database, ITestSettings}

package object test {
  implicit class DslFilesCollage(val setups: Traversable[TestSetup]) extends AnyVal {
    def dslFiles = setups.foldLeft(new MFiles){ _ ++= _.dslFiles }.toMap
  }

  implicit class TestFilesCollage(val projects: Traversable[config.ITestProject]) extends AnyVal {
    def testFiles = {
      val testFilesBuilder = new MMap[Language, MFiles]

      for { p <- projects; (language, testFiles) <- p.testFiles } {
        testFilesBuilder.getOrElse(language, {
          val mFiles = new MFiles
          testFilesBuilder(language) = mFiles
          mFiles
        }) ++= testFiles
      }

      testFilesBuilder.map(e => e.copy(_2 = e._2.toMap)).toMap
    }
  }

  import types._

  val overrideTypes = Seq(
//    `type.Double`
//    `type.Point`
  )

  object OcdTypeSingletonExtender {
    private val postgresSupportedTyes = Seq(
      `type.Binary`
//    , `type.Bits`
    , `type.Boolean`
//    , `type.Color`
    , `type.Date`
    , `type.Decimal`
    , `type.Decimal(9)`
    , `type.Double`
//    , `type.Email`
    , `type.Float`
    , `type.Guid`
    , `type.Image`
    , `type.Integer`
    , `type.Ip`
//    , `type.Json`
    , `type.Location`
    , `type.Long`
    , `type.Map`
    , `type.Money`
//    , `type.Native`
//    , `type.Phone`
    , `type.Point`
    , `type.Rectangle`
//    , `type.S3`
//    , `type.Secret`
//    , `type.Stream`
    , `type.String`
    , `type.String(9)`
    , `type.Text`
//    , `type.Time`
    , `type.Timestamp`
    , `type.Url`
    , `type.Xml`
    )

    private val oracleSupportedTyes = Seq(
      `type.Binary`
//    , `type.Bits`
    , `type.Boolean`
//    , `type.Color`
    , `type.Date`
    , `type.Decimal`
    , `type.Decimal(9)`
    , `type.Double`
//    , `type.Email`
    , `type.Float`
    , `type.Guid`
//    , `type.Image`
    , `type.Integer`
    , `type.Ip`
//    , `type.Json`
//    , `type.Location`
    , `type.Long`
//    , `type.Map`
    , `type.Money`
//    , `type.Native`
//    , `type.Phone`
//    , `type.Point`
//    , `type.Rectangle`
//    , `type.S3`
//    , `type.Secret`
//    , `type.Stream`
    , `type.String`
    , `type.String(9)`
    , `type.Text`
//    , `type.Time`
    , `type.Timestamp`
//    , `type.Url`
//    , `type.Xml`
    )
  }

  implicit class OcdTypeSingletonExtender(val ocdType: types.OcdType.type) extends AnyVal {
    import OcdTypeSingletonExtender._

    def useCaseValues(testSettings: ITestSettings): Seq[types.OcdType] = overrideTypes match {
      case overrides if overrides.nonEmpty => overrides
      case _ => testSettings.database match {
        case Database.Oracle => oracleSupportedTyes
        case Database.PostgreSQL => postgresSupportedTyes
      }
    }
  }

  implicit class ClassyDSLTyper(val ocdDsl: dsls.OcdDslBoxType.type) extends AnyVal {
    def toDsl(concept: String, box: boxes.OcdBox) =
      ocdDsl.resolve(types.`type.Guid`, box).dslName.replace("Guid", concept)
  }
}
