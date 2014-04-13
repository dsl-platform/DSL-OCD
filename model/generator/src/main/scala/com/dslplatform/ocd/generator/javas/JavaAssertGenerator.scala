package com.dslplatform.ocd
package generator
package javas

import types._
import boxes._

import javaasserts._
import javatypes._

object JavaAssertGenerator
    extends Generator {

  def generate() {
    val root = spawnDirectory("javaasserts", "java")
    for (t <- TypeGenerator.typeValues if JavaGenerator.stubs.isDefinedAt(t.name.dslName)) {
      val name = t.name.singleName
      val stub = JavaGenerator.stubs(t.name.dslName)

      val asserts = BoxGenerator.boxValues map(box => JavaAsserts(name, stub, box).body)
      val body = s"""package com.dslplatform.ocd.javaasserts;

import org.junit.Assert;

public class ${name}Asserts {${asserts.mkString}}
"""
      (root / s"${name}Asserts.java").write(body)
    }
  }
}

case class JavaAsserts(name: String, stub: JavaStub, box: Box)
    extends OneAsserts
    with NullableAsserts
    with OneArrayOfOneAsserts
    with OneArrayOfNullableAsserts
    with NullableArrayOfOneAsserts
    with NullableArrayOfNullableAsserts
    with OneListOfOneAsserts
    with NullableListOfOneAsserts
    with OneListOfNullableAsserts
    with NullableListOfNullableAsserts
    with OneSetOfOneAsserts
    with NullableSetOfOneAsserts
    with OneSetOfNullableAsserts
    with NullableSetOfNullableAsserts {

  import SingleFamily._
  import CollectionFamily._

  def body: String = (box: Box) match {
    case Box(One, None, _*) =>
      oneAsserts

    case Box(Nullable, None, _*) =>
      nullableAsserts

    case Box(One, Some((Array, One)), _*) =>
      oneArrayOfOneAsserts

    case Box(Nullable, Some((Array, One)), _*) =>
      nullableArrayOfOneAsserts

    case Box(One, Some((Array, Nullable)), _*) =>
      oneArrayOfNullableAsserts

    case Box(Nullable, Some((Array, Nullable)), _*) =>
      nullableArrayOfNullableAsserts

    case Box(One, Some((List, One)), _*) =>
      oneListOfOneAsserts

    case Box(Nullable, Some((List, One)), _*) =>
      nullableListOfOneAsserts

    case Box(One, Some((List, Nullable)), _*) =>
      oneListOfNullableAsserts

    case Box(Nullable, Some((List, Nullable)), _*) =>
      nullableListOfNullableAsserts

    case Box(One, Some((Set, One)), _*) =>
      oneSetOfOneAsserts

    case Box(Nullable, Some((Set, One)), _*) =>
      nullableSetOfOneAsserts

    case Box(One, Some((Set, Nullable)), _*) =>
      oneSetOfNullableAsserts

    case Box(Nullable, Some((Set, Nullable)), _*) =>
      nullableSetOfNullableAsserts
  }

  val clazz = stub.classValue(box)
  val isCollection = box.collectionFamily.isDefined
  val isPrimitive = stub.classPrimitive.isDefined

  val boxName = box.name
  val testName = boxName + name
  val mismatch = testName + " mismatch"

  val primitive = stub.classPrimitive.getOrElse("")
  val primitiveValue = stub.classPrimitive.map("." + _ + "Value()").getOrElse("")
  val reference = stub.classReference
  val elemType = box.collectionFamily.map(_._2).getOrElse(One)

  val (expectedX, actualX) = if (isCollection) (("expecteds", "actuals")) else (("expected", "actual"))

  val factors = {
    case class PrecisionFactors(signature: String, argument: String, method: String) {
      val rawConverter = s"${name}.${clazz}ToRaw${if (stub eq JavaDouble) "Long" else "Int"}Bits"
    }

    stub match {
      case JavaFloat | JavaDouble | JavaLocation | JavaRectangle =>
        new PrecisionFactors(", final int ulps", ", ulps", s"""
    public static void assert${boxName}Equals(final ${clazz} ${expectedX}, final ${clazz} ${actualX}) {
        assert${boxName}Equals(${expectedX}, ${actualX}, 0);
    }
""")

      case JavaTimestamp =>
        new PrecisionFactors(", final org.joda.time.Duration delta", ", delta", s"""
    public static void assert${boxName}Equals(final ${clazz} ${expectedX}, final ${clazz} ${actualX}) {
        assert${boxName}Equals(${expectedX}, ${actualX}, org.joda.time.Duration.ZERO);
    }
""")

      case _ => PrecisionFactors("", "", "")
    }
  }
}
