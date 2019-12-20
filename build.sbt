organization := "com.micronautics" // TODO provide your organization's information

name := "HelloServiceProjectJB"

version := "0.1"

scalaVersion := "2.13.1"

javacOptions ++= Seq(
  "-Xlint:deprecation",
  "-Xlint:unchecked",
  "-source", "13",
  "-target", "13",
  "-g:vars"
)

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided",
  "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.3" % "provided",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test withSources(),
  "junit" % "junit" % "4.12" % Test
)