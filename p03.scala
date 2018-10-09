// P03: Find the Kth element of a list (without using the built-in list accessor).
def nth[A](indx: Int, lst: List[A]): A = {
  if (indx == 0) {
    lst(indx)
  } else lst match {
    case _ :: tail => nth(indx - 1, tail)
    case _ => throw new NoSuchElementException
  }
}
