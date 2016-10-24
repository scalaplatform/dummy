name := "dummy"

// Version should always be defined in 0.1

scalaVersion := "2.11.8"
    
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test"

// add temporary task until the sbt release plugin is ready
lazy val releaseNightly = taskKey[Unit]("releaseNightly")
releaseNightly := {
  println("success")
}

// add temporary task until the sbt release plugin is ready
lazy val releaseBeta = taskKey[Unit]("releaseBeta")
releaseBeta := {
  println("success")
}

// add temporary task until the sbt release plugin is ready
lazy val releaseStable = taskKey[Unit]("releaseStable")
releaseStable := {
  println("success")
}
