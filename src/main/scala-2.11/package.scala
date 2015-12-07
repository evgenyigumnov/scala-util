package com.igumnov
package object scalautil {

  implicit class StringImprovements(s: String) {
    def println = Predef.println(s)
    def print = Predef.print(s)
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


  type JSet[T] = java.util.Set[T]

  type JHashSet[T] = java.util.HashSet[T]

  object JHashSet {
    def apply[A] = new JHashSet[A]
  }


  type JIterable[T] = java.lang.Iterable[T]


}