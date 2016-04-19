package com.dslplatform.ocd

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

  implicit class OcdTypeSingletonExtender(val ocdType: types.OcdType.type) extends AnyVal {
    import types._

    def useCaseValues = IndexedSeq(
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
    , `type.Image`     // ORA 0 points
    , `type.Integer`
    , `type.Ip`
//    , `type.Json`
    , `type.Location`  // ORA 0 points
    , `type.Long`
    , `type.Map`       // ORA 0 points
    , `type.Money`
//    , `type.Native`
//    , `type.Phone`
    , `type.Point`     // ORA 0 points
    , `type.Rectangle` // ORA 0 points
//    , `type.S3`
//    , `type.Secret`
//    , `type.Stream`
    , `type.String`
    , `type.String(9)`
    , `type.Text`
//    , `type.Time`
    , `type.Timestamp`
    , `type.Url`       // ORA 0 points
    , `type.Xml`       // ORA 0 points
    )
  }

  implicit class ClassyDSLTyper(val ocdDsl: dsls.OcdDslBoxType.type) extends AnyVal {
    def toDsl(concept: String, box: boxes.OcdBox) =
      ocdDsl.resolve(types.`type.Guid`, box).dslName.replace("Guid", concept)
  }
}
