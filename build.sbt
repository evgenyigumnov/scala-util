name := "scala-util"

version := "0.2"

organization := "com.igumnov.scalautil"


scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
//publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := {
  <url>https://github.com/evgenyigumnov/scala-util</url>
    <licenses>
      <license>
        <name>GNU General Public License, version 2</name>
        <url>http://opensource.org/licenses/GPL-2.0</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:git@github.com:evgenyigumnov/scala-util.git</connection>
      <developerConnection>scm:git:git@github.com:evgenyigumnov/scala-util.git</developerConnection>
      <url>git@github.com:evgenyigumnov/scala-util.git</url>
    </scm>
    <developers>
      <developer>
        <name>Evgeny Igumnov</name>
        <email>igumnov@gmail.com</email>
        <url>http://evgeny.igumnov.com</url>
      </developer>
    </developers>
}