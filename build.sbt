/// Project

name := "play-stylus"

sbtPlugin := true

version := "1.1.0-SNAPSHOT"

//scalaVersion := "2.10.4"

organization := "patience"

description := "sbt plugin for handling stylus assets in Play"

/// Repositories
publishTo := Some(Resolver.sftp("Patience", "repo.patience.io", "repo"))

resolvers += "typesafe-releases" at "http://repo.typesafe.com/typesafe/releases/"

/// Dependencies
addSbtPlugin("com.typesafe.play" %% "sbt-plugin" % "2.3.0")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.3.0",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  // ... class file needed by PlayAssetsCompiler is missing. reference value javascript of package com.google refers to nonexisting symbol...
  "com.google.javascript" % "closure-compiler" % "r1043"
)
