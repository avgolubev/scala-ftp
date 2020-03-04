name := "scala-ftp"

version := "1.0"

scalaVersion := "2.11.8"

logLevel := Level.Warn

libraryDependencies ++= Seq(
    "commons-net"   % "commons-net"    % "3.3"
  , "org.scalatest" %% "scalatest" % "2.1.7" % "test"
)
    