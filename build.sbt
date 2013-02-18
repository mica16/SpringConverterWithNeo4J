name := "TestConverter"
 
version := "1.0-SNAPSHOT"
 
organization := "com.example"
 
scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
    "org.springframework" % "spring-aop" % "3.2.0.RELEASE",
    "org.springframework" % "spring-aspects" % "3.2.0.RELEASE",
    "org.springframework" % "spring-beans" % "3.2.0.RELEASE",
    "org.springframework.data" % "spring-data-commons-core" % "1.4.0.RELEASE",
    "org.springframework" % "spring-expression" % "3.2.0.RELEASE",
    "org.springframework" % "spring-jdbc" % "3.2.0.RELEASE",
    "org.springframework" % "spring-orm" % "3.2.0.RELEASE",
    "org.springframework" % "spring-test" % "3.2.0.RELEASE",
    "org.springframework" % "spring-tx" % "3.2.0.RELEASE",
    "org.springframework.data" % "spring-data-neo4j" % "2.2.0.RELEASE" excludeAll(
      ExclusionRule(organization = "com.sun.jdmk"),
      ExclusionRule(organization = "com.sun.jmx"),
      ExclusionRule(organization = "javax.jms")
      ),
    "org.neo4j" % "neo4j" % "1.9.M04",
    "org.neo4j" % "neo4j-kernel" % "1.9.M04" % "test" classifier "tests" classifier "",
    "asm" % "asm-all" % "3.1",
    "org.springframework.data" % "spring-data-neo4j-rest" % "2.1.0.RELEASE" excludeAll(
      ExclusionRule(organization = "org.neo4j")
      ),
     "org.neo4j" % "neo4j-rest-graphdb" % "1.9.M04",
     "javax.validation" % "validation-api" % "1.0.0.GA"
  )

resolvers ++= Seq(
      "TAMU Release Repository" at "https://maven.library.tamu.edu/content/repositories/releases/",
      "Spring Release Repository" at "https://repo.springsource.org/libs-release",
      "Neo4j Cypher DSL Repository" at "http://m2.neo4j.org/content/repositories/releases",
      "Neo4j Releases" at "http://m2.neo4j.org/content/repositories/releases",
      "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
      "releases" at "http://oss.sonatype.org/content/repositories/releases")
