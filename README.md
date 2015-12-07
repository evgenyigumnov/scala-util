# scala-util

## Usage of library

### Sbt

    libraryDependencies += "com.igumnov.scalautil" % "scala-util_2.11" % "0.2"

### Maven
    <dependency>
    	<groupId>com.igumnov.scalautil</groupId>
    	<artifactId>scala-util_2.11</artifactId>
    	<version>0.2</version>
    </dependency>

### Import

    import com.igumnov.scalautil._

## Printing to stdout

    "Bla-bla".print // print "Bla-bla" to stdout
    "New line bla-bla".println // print "New line Bla-bla" to stdout with new line

## Java collections aliases

    val arrayList = JArrayList[String] // new java.util.ArrayList[String]
    val hashTable = JHashtable[String,String] // new java.util.Hashtable[String,String]
    val hashSet = JHashSet[String] // new java.util.HashSet[String]

