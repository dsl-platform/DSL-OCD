// ### COMPILE SETTINGS ### //

scalaVersion := "2.12.8"
scalacOptions := Seq(
  "-deprecation",                     // Emit warning and location for usages of deprecated APIs.
  "-encoding", "UTF-8",               // Specify character encoding used by source files.
  "-feature",                         // Emit warning and location for usages of features that should be imported explicitly.
  "-language:_",                      // Enable or disable language features: `_' for all, `-language:help' to list choices.
  "-opt:l:method",                    // Enable intra-method optimizations: unreachable-code,simplify-jumps,compact-locals,copy-propagation,redundant-casts,box-unbox,nullness-tracking,closure-invocations.
  "-target:jvm-1.8",                  // Target platform for object files. All JVM 1.5 - 1.7 targets are deprecated. Choices: (jvm-1.5,jvm-1.6,jvm-1.7,jvm-1.8), default: jvm-1.8.
  "-unchecked",                       // Enable additional warnings where generated code depends on assumptions.
  "-Xcheckinit",                      // Wrap field accessors to throw an exception on uninitialized access.
  "-Xexperimental",                   // Enable experimental extensions.
  "-Xfuture",                         // Turn on future language features.
  "-Xlint:adapted-args",              // Warn if an argument list is modified to match the receiver.
  "-Xlint:nullary-unit",              // Warn when nullary methods return Unit.
  "-Xlint:inaccessible",              // Warn about inaccessible types in method signatures.
  "-Xlint:nullary-override",          // Warn when non-nullary `def f()' overrides nullary `def f'.
  "-Xlint:infer-any",                 // Warn when a type argument is inferred to be `Any`.
  "-Xlint:-missing-interpolator",     // A string literal appears to be missing an interpolator id.
  "-Xlint:doc-detached",              // A Scaladoc comment appears to be detached from its element.
  "-Xlint:private-shadow",            // A private field (or class parameter) shadows a superclass field.
  "-Xlint:type-parameter-shadow",     // A local type parameter shadows a type already in scope.
  "-Xlint:poly-implicit-overload",    // Parameterized overloaded implicit methods are not visible as view bounds.
  "-Xlint:option-implicit",           // Option.apply used implicit view.
  "-Xlint:delayedinit-select",        // Selecting member of DelayedInit.
  "-Xlint:by-name-right-associative", // By-name parameter of right associative operator.
  "-Xlint:package-object-classes",    // Class or object defined in package object.
  "-Xlint:unsound-match",             // Pattern match may not be typesafe.
  "-Xlint:stars-align",               // Pattern sequence wildcard must align with sequence component.
  "-Xlint:constant",                  // Evaluation of a constant arithmetic expression results in an error.
  "-Xlint:-unused",                   // Enable -Ywarn-unused:imports,privates,locals,implicits.
  "-Ybackend-parallelism", "4",       // Maximum worker threads for backend
  "-Yno-adapted-args",                // Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
  "-Yrangepos",                       // Use range positions for syntax trees.
  "-Yrepl-sync",                      // Do not use asynchronous code for repl startup
)

javacOptions in doc := Seq(
  "-encoding", "UTF-8",
  "-source", "1.8",
)
javacOptions := Seq(
  "-deprecation",
  "-parameters",
  "-target", "1.8",
  "-Xlint",
) ++ (javacOptions in doc).value

publishArtifact in packageDoc := false
