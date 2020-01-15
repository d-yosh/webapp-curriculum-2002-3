import scala.annotation.tailrec

object Main {

  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    @tailrec
    def isSortedRec(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!ordered(sortedSeq(i), sortedSeq(i + 1))) false
      else isSortedRec(i + 1)
    }

    if (sortedSeq.isEmpty) true else isSortedRec(0)
  }

}
