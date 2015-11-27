# scala-util

## Usage of library

    import com.igumnov.scalautil._

## Printing to stdout

    "Bla-bla".print // print "Bla-bla" to stdout
    "New line bla-bla".println // print "New line Bla-bla" to stdout with new line

## Java collections aliases

    val arrayList = JArrayList[String] // new java.util.ArrayList[String]
    val hashTable = JHashtable[String,String] // new java.util.Hashtable[String,String]
