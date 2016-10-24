logLevel := Level.Warn

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.11")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M14")

{
  val pluginVersion = System.getProperty("plugin.version")
  if(pluginVersion == null) logLevel := Level.Warn // Don't do anything, for now
  else addSbtPlugin("ch.epfl.scala" % "sbt-platform" % pluginVersion)
}
