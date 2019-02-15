// P04: Find the number of elements of a list (without using the built-in .length or .size functions).
def length[A](lst: List[A], len: Int = 0): Int = {
  lst match {
    case _ :: more => {
      length(more, len + 1)
    }
    case _ => len
  }
}
