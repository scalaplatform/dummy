logLevel := Level.Warn

{
  val pluginVersion = System.getProperty("plugin.version")
  if(pluginVersion == null) logLevel := Level.Warn // Don't do anything, for now
  else addSbtPlugin("ch.epfl.scala" % "sbt-platform" % pluginVersion)
}
