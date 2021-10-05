#/bin/sh

sbt compile
scala -classpath target/scala-2.13/classes Main -J-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5050