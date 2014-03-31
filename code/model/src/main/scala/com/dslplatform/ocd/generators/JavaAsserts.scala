package com.dslplatform.ocd.generators

import Boxes._
import javas._

import javaasserts._

object JavaAsserts
    extends Generator {

  def generate() {
    val root = spawnDirectory("javaasserts", "java")
    for (t <- Types.types if Javas.stubs.isDefinedAt(t.name.grammarName)) {
      val name = t.name.singleName
      val stub = Javas.stubs(t.name.grammarName)

      val asserts = boxes map(box => JavaAsserts(name, stub, box).body)
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

  import SingleType._
  import CollectionType._

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
  val isCollection = box.collectionType.isDefined
  val isPrimitive = stub.classPrimitive.isDefined

  val boxName = box.name
  val testName = boxName + name
  val mismatch = testName + " mismatch"

  val primitive = stub.classPrimitive.getOrElse("")
  val primitiveValue = stub.classPrimitive.map("." + _ + "Value()").getOrElse("")
  val reference = stub.classReference
  val elemType = box.collectionType.map(_._2).getOrElse(One)

  val (expectedX, actualX) = if (isCollection) (("expecteds", "actuals")) else (("expected", "actual"))
  def ifStr(condition: Boolean, text: String, alter: String = "") = if (condition) text else alter

  val customHashcodes = stub match { case JavaBinary | JavaDouble | JavaFloat | JavaLocation | JavaRectangle | JavaXml => true; case _ => false }

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
