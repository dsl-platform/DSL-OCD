//package com.dslplatform.ocd
//
//trait JavaTestRoot extends JavaTest with JavaRoot {
//  def repositoryName = RootClass.fcil + "Repo"
//
//  def imports = s"""
//import ${packageName}.${ModuleName}.${RootClass};
//import ${packageName}.${ModuleName}.repositories.${RepositoryClass};
//"""
//
//  def staticFields = s"""
//    private static ${RepositoryClass} ${repositoryName};
//"""
//
//  def beforeClass = s"""
//        ${repositoryName} = locator.resolve(${RepositoryClass}.class);
//"""
//
//  def afterClass = s"""
//        ${repositoryName} = null;
//"""
//
//  def beforeTest = s"""
//        final List<${RootClass}> allRootItems = ${repositoryName}.findAll().get();
//        ${repositoryName}.delete(allRootItems).get();
//"""
//
//  def afterTest = s"""
//"""
//}
