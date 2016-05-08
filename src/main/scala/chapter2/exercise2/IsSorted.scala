package chapter2.exercise2

/**
  * Created by lbajor on 2016-05-08.
  */
object IsSorted {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean =
  as.length match {
    case 0 => true
    case 1 => true
    case _ => ordered(as.head, as.tail.head) && isSorted(as.tail.tail, ordered)
  }
}
