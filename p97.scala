

class BoardSpace(var newVal: Option[Int]) {
  var value: Option[Int] = newVal
  var possibilities: Array[Array[Int]] = Array[Array[Int]]()
}



object Sudoku {

  val board = Array[Array[BoardSpace]]()

  def fillBoard()= {
    val init: List[String] = List(
      ".  .  4 | 8  .  . | .  1  7",
      "6  7  . | 9  .  . | .  .  .",
      " 5  .  8 | .  3  . | .  .  4",
      "3  .  . | 7  4  . | 1  .  .",
      ".  6  9 | .  .  . | 7  8  .",
      ".  .  1 | .  6  9 | .  .  5",
      " 1  .  . | .  8  . | 3  .  6",
      ".  .  . | .  .  6 | .  9  1",
      "2  4  . | .  .  1 | 5  .  ."
    )
    // copy from string above into board
    for (line <- init) {
      var newLine = Array[BoardSpace]()
      for (char <- line) {
        if (char != ' ' && char != '|') {
          if (char == '.') {
            newLine :+ new BoardSpace(None)
          } else if (char.isDigit) {
            newLine :+ new BoardSpace(Some(char.toInt))
          }
        }
      }
      board :+ newLine
    }
    // go through board and fill in possibilities for each BoardSpace
  }

  def printBoard() = {
    for (line <- board) {
      for (cell <- line) {
        cell.value match {
          case None => print("_")
          case Some(x) => print(x)
        }
      }
      print("\n")
    }
  }


  def turn() = {

  }

  def checkDone(): Boolean = {
    return false
  }

  def run() = {
    while (!checkDone()) {
      turn()
    }
  }

}

Sudoku.fillBoard()
Sudoku.printBoard()