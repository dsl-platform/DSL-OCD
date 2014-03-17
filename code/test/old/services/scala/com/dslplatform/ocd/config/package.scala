package com.dslplatform.ocd

import com.dslplatform.compiler.client.api.params.Language
import scala.collection.mutable.LinkedHashMap

package object config {
  implicit class ITestSetupHelper(testSetup: ITestSetup) {
    def packageName =
      testSetup.tests.head.packageName

    def aggregatedLanguages =
      testSetup.codeFiles.keySet ++
      testSetup.tests.flatMap(_.testFiles.keySet)

    def aggregatedDslFiles =
      testSetup.tests.flatMap(_.dslFiles).toMap

    def aggregatedTestFiles = {
      val buffer = new LinkedHashMap[Language, Files]

      for {
        test <- testSetup.tests
        (language, testFiles) <- test.testFiles
      } {
        if (buffer contains language) {
          buffer(language) ++= testFiles
        }
        else {
          buffer(language) = testFiles
        }
      }

      Map.empty ++ buffer
    }
  }
}
