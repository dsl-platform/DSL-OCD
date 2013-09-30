//package com.dslplatform.ocd
//
//object Generator {
//  private def cleanup(text: String) = text
//    .replaceAll("\n{3,}", "\n\n")
//    .replaceAll("(\\{\n)\n+", "$1")
//    .replaceAll("\n+(\n *\\})", "$1")
//
//  def apply(test: OcdTest) = {
//    cleanup(test.testTemplate.trim)
//  }
//}
