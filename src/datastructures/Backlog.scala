package datastructures

import scala.collection.mutable


class Backlog[A](f1:(A=>Unit)) {
  var queuesytem: mutable.Queue[A] = new mutable.Queue[A]()
  def addTask(task:A):Unit={
    queuesytem = queuesytem :+ task

  }
  def completeTask():Unit={
    if (queuesytem != null){
      f1(queuesytem.head)
      queuesytem = queuesytem.drop(1)
    }else{
      null
    }
  }


}
