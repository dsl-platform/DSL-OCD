package com.dslplatform.ocd
package staging

object Main
    extends App {

  def time[R](section: String, runSection: => Unit): Unit = {
    logger.info(s"### $section START ###")
    val startAt = System.currentTimeMillis
    runSection
    val endAt = System.currentTimeMillis
    logger.info(s"### $section END (took: ${endAt - startAt} ms) ###")
  }

  val allArgs = args ++ Seq(
  )

  val skipSource = allArgs contains "source:skip"
  val skipAnalyse = allArgs contains "analyse:skip"
  val skipCompile = allArgs contains "compile:skip"
  val skipFetch = allArgs contains "fetch:skip"
  val skipDownload = allArgs contains "download:skip"
  val skipUtil = allArgs contains "util:skip"
  val skipModel = allArgs contains "model:skip"
  val skipDrivers = allArgs contains "drivers:skip"
  val skipLanguages = allArgs contains "languages:skip"
  val skipGather = allArgs contains "gather:skip"
  val skipDeploy = allArgs contains "deploy:skip"
  val skipTest = allArgs contains "test:skip"
  val includePrereleases = true // allArgs contains "fetch:include-prereleases"

  time("Staging",
    try {
      time("Source", Source(skipSource))
      time("Analyse", Analyse(skipAnalyse))
      time("Compile", Compile(skipCompile))
      time("Fetch", Fetch(skipFetch, includePrereleases))
      time("Download", Download(skipDownload))
      time("Util", Util(skipUtil))
      time("Model", Model(skipModel))
      time("Drivers", Drivers(skipDrivers))
      time("Languages", Languages(skipLanguages))
      time("Gather", Gather(skipGather))
      time("Deploy", Deploy(skipDeploy))
      time("Test", Test(skipTest))
    } finally {
      pool.shutdown()
    }
  )
}
