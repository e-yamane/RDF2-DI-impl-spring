name := "rdf2-di-impl-spring"

description := "Rough Diamond Framework DI Container implimentation SpringFramework"

organization := "jp.rough_diamond"

version := "2.0.1"

scalaVersion := "2.9.1"

libraryDependencies ++=  Seq(
    "jp.rough_diamond"      %%  "rdf2-di"           % "2.0.1"
    ,"org.springframework"  %   "spring-core"       % "3.1.1.RELEASE"
    ,"org.springframework"  %   "spring-beans"      % "3.1.1.RELEASE"
)

libraryDependencies +=  "org.slf4j"             %   "jcl-over-slf4j"    % "1.6.2"

libraryDependencies +=  "junit"                 %   "junit"             % "4.10"    % "test"

seq(rdf.settings : _*)
