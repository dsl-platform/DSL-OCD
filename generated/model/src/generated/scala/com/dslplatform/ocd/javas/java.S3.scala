package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaS3
    extends OcdJava
    with `type.S3`

case object `java.S3`
    extends JavaS3 with `box.One` {

  val javaClass = "com.dslplatform.storage.S3"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.S3[]`
    extends JavaS3 with `box.OneArrayOfOne` {

  val javaClass = "com.dslplatform.storage.S3[]"

  val defaultValue = "new com.dslplatform.storage.S3[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.S3?[]`
    extends JavaS3 with `box.OneArrayOfNullable` {

  val javaClass = "com.dslplatform.storage.S3[]"

  val defaultValue = "new com.dslplatform.storage.S3[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<S3>`
    extends JavaS3 with `box.OneListOfOne` {

  val javaClass = "java.util.List<com.dslplatform.storage.S3>"

  val defaultValue = "new java.util.ArrayList<com.dslplatform.storage.S3>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<S3?>`
    extends JavaS3 with `box.OneListOfNullable` {

  val javaClass = "java.util.List<com.dslplatform.storage.S3>"

  val defaultValue = "new java.util.ArrayList<com.dslplatform.storage.S3>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<S3>`
    extends JavaS3 with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<com.dslplatform.storage.S3>"

  val defaultValue = "new java.util.HashSet<com.dslplatform.storage.S3>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<S3?>`
    extends JavaS3 with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<com.dslplatform.storage.S3>"

  val defaultValue = "new java.util.HashSet<com.dslplatform.storage.S3>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.S3?`
    extends JavaS3 with `box.Nullable` {

  val javaClass = "com.dslplatform.storage.S3"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.S3[]?`
    extends JavaS3 with `box.NullableArrayOfOne` {

  val javaClass = "com.dslplatform.storage.S3[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.S3?[]?`
    extends JavaS3 with `box.NullableArrayOfNullable` {

  val javaClass = "com.dslplatform.storage.S3[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<S3>?`
    extends JavaS3 with `box.NullableListOfOne` {

  val javaClass = "java.util.List<com.dslplatform.storage.S3>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<S3?>?`
    extends JavaS3 with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<com.dslplatform.storage.S3>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<S3>?`
    extends JavaS3 with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<com.dslplatform.storage.S3>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<S3?>?`
    extends JavaS3 with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<com.dslplatform.storage.S3>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
