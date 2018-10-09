// P02: Find the last but one element of a list (without using built-in init and last).
def penultimate[A](lst: List[A]): A = lst match {
  case x :: y :: Nil => x
  case x :: tail => penultimate(tail)
  case _ => throw new NoSuchElementException
}
