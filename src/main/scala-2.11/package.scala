package com.igumnov
package object util {

  implicit class StringImprovements(s: String) {
    def println:Unit = Predef.println(s)
    def print:Unit = Predef.print(s)
  }

  type JList[T] = java.util.List[T]

  type JArrayList[T] = java.util.ArrayList[T]

  object JArrayList {
    def apply[T] = new JArrayList[T]
  }


  type JMap[A,B] = java.util.Map[A,B]

  type JHashtable[A,B] = java.util.Hashtable[A,B]

  object JHashtable {
    def apply[A,B] = new JHashtable[A,B]
  }


  type JIterable[T] = java.lang.Iterable[T]


}