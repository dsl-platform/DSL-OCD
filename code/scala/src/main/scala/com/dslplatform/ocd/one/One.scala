//package com.dslplatform.ocd
//package one
//
//import com.dslplatform.compiler.client.io.Logger
//import com.dslplatform.compiler.client.cmdline.logger.LoggerSlf4j
//import com.dslplatform.compiler.client.api.ApiCall
//import com.dslplatform.compiler.client.api.Actions
//import com.dslplatform.compiler.client.api.params.Credentials
//import com.dslplatform.compiler.client.api.params.DSL
//import scala.collection.JavaConverters._
//import com.dslplatform.compiler.client.api.params.ProjectID
//import com.dslplatform.compiler.client.api.params.Language
//import com.dslplatform.compiler.client.api.params.PackageName
//import com.dslplatform.compiler.client.cmdline.logger.LoggerSystem
//import com.dslplatform.client.ProjectSettings
//import scalax.io._
//import scalax.file._
//import java.util.Properties
//
//object Compiler {
//  TestSettings.load(".config/DSL-OCD/test.ini")
//}
//
//object One extends App {
//  val root = Path("d:/Code/DSL-OCD/code/java", '/')
//
//  val logger = new LoggerSystem(Logger.Level.ALL)
//  val apiCall = new ApiCall(logger)
//  val actions = new Actions(logger, apiCall)
//
//  val remaining = root.deleteRecursively(true, true)._2
//  if (remaining > 0) {
//    logger.warn(s"Could not delete all generated resources ($remaining)")
//  }
//
//
//
////  new ProjectSettings
//
///*
//  val auth = new Credentials("ngsutil@dsl-platform.com", "aoeuaoeu")
//  val dsl = new DSL(Map("model.dsl" -> OneTemplate.dsl).asJava)
//  val projectID = new ProjectID(UUID("ed569d21-0ecc-44fe-8237-7c2c42814c7a"))
//  val packageName = new PackageName("com.dslplatform.ocd.generated")
//  val language = Language.JAVA
//
//  val updateUnsafe = actions.updateUnsafe(auth, dsl, projectID, packageName, language)
//  val bodies = updateUnsafe.getFileBodies()
//
//  println(updateUnsafe.getMessages())
//
//  println(bodies)
//*/
//}
//
//object OneTemplate {
//
//  val dsl = s"""
//module OneBool {
//  root OneBoolRoot {
//    Bool oneBool;
//  }
//}
//"""
//}
///*
//  val json = s"""
//{"oneBool":true}
//"""
//
//  val template = s"""
//[[oneBool]]
//"""
//  val test = s"""
//package com.dsplatform.ocd.generated.tests;
//
//import com.dslplatform.ocd.generated.OneBool.OneBoolRoot;
//import com.dslplatform.client.Bootstrap;
//import com.dslplatform.patterns.ServiceLocator;
//
//public class OneBoolTest {
//    public static void main(final String[] args) {
//        final ServiceLocator locator =
//            Bootstrap.init(System.getProperty("user.home") + "/.config/DSL-OCD/project.ini")
//
//        final OneBoolRoot oneBoolRoot = new OneBoolRoot();
//        System.out.println("It is a bool: " + oneBoolRoot");
//
//        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
//    }
//}
//"""
//
//}
//*/
