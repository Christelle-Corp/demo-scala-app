name := "demo-scala-app"

version := "1.0"

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  // Log4Shell vulnerability - CVE-2021-44228
  "org.apache.logging.log4j" % "log4j-core" % "2.14.1",
  
  // Jackson deserialization vulnerabilities
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8",
  
  // SnakeYAML vulnerability - CVE-2017-18640
  "org.yaml" % "snakeyaml" % "1.17",
  
  // Commons BeanUtils vulnerability - CVE-2014-0114
  "commons-beanutils" % "commons-beanutils" % "1.9.2"
)
