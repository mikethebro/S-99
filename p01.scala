// P01:  Find the last element of a list (without using built-in tail operation).
def last[A](lst: List[A]): A = lst match {
  case elem :: Nil => elem
  case _ :: tail => last(tail)
  case _ => throw new NoSuchElementException
}
