package rules.moves

import pieces.Piece
import squares.Board
import squares.Square

class DiagonalMoveRule(override val limit: Int = 0) : MoveRule {
     override fun isMovePossible(board: Board, sqFrom: Square, sqTo: Square): Boolean {
        TODO()
    }
}