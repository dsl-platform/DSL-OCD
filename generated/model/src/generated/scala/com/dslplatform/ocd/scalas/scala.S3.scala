package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaS3
    extends OcdScala
    with `type.S3`

case object `scala.S3`
    extends ScalaS3 with `box.One` {

  val scalaClass = "com.dslplatform.storage.S3"

  val defaultValue = "null"
}

case object `scala.S3[]`
    extends ScalaS3 with `box.OneArrayOfOne` {

  val scalaClass = "Array[com.dslplatform.storage.S3]"

  val defaultValue = "Array[com.dslplatform.storage.S3].empty"
}

case object `scala.S3?[]`
    extends ScalaS3 with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[com.dslplatform.storage.S3]]"

  val defaultValue = "Array[Option[com.dslplatform.storage.S3]].empty"
}

case object `scala.List<S3>`
    extends ScalaS3 with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[com.dslplatform.storage.S3]"

  val defaultValue = "IndexedSeq[com.dslplatform.storage.S3].empty"
}

case object `scala.List<S3?>`
    extends ScalaS3 with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[com.dslplatform.storage.S3]]"

  val defaultValue = "IndexedSeq[Option[com.dslplatform.storage.S3]].empty"
}

case object `scala.Set<S3>`
    extends ScalaS3 with `box.OneSetOfOne` {

  val scalaClass = "Set[com.dslplatform.storage.S3]"

  val defaultValue = "Set[com.dslplatform.storage.S3].empty"
}

case object `scala.Set<S3?>`
    extends ScalaS3 with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[com.dslplatform.storage.S3]]"

  val defaultValue = "Set[Option[com.dslplatform.storage.S3]].empty"
}

case object `scala.S3?`
    extends ScalaS3 with `box.Nullable` {

  val scalaClass = "Option[com.dslplatform.storage.S3]"

  val defaultValue = "None"
}

case object `scala.S3[]?`
    extends ScalaS3 with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[com.dslplatform.storage.S3]]"

  val defaultValue = "None"
}

case object `scala.S3?[]?`
    extends ScalaS3 with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[com.dslplatform.storage.S3]]]"

  val defaultValue = "None"
}

case object `scala.List<S3>?`
    extends ScalaS3 with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[com.dslplatform.storage.S3]]"

  val defaultValue = "None"
}

case object `scala.List<S3?>?`
    extends ScalaS3 with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[com.dslplatform.storage.S3]]]"

  val defaultValue = "None"
}

case object `scala.Set<S3>?`
    extends ScalaS3 with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[com.dslplatform.storage.S3]]"

  val defaultValue = "None"
}

case object `scala.Set<S3?>?`
    extends ScalaS3 with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[com.dslplatform.storage.S3]]]"

  val defaultValue = "None"
}
