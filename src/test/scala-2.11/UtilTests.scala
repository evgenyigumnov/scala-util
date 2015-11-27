package com.igumnov.scalautil.test

import org.scalatest._

class UtilTests  extends FlatSpec with Matchers {

  "Test" should "Ok" in {
    import com.igumnov.scalautil._


    "\"test1\".println" should compile
    "\"test2\".print" should compile



    val arrayList = JArrayList[String]
    arrayList.isInstanceOf[java.util.ArrayList[String]] should be (true)

    val hashTable = JHashtable[String,String]
    hashTable.isInstanceOf[java.util.Hashtable[String,String]] should be (true)

  }

}