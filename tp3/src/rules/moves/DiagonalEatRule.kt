package rules.moves

import squares.Board
import squares.Square

class DiagonalEatRule(override val limit: Int = 0) : MoveRule {
    private val diagonalMoveRule = DiagonalMoveRule(limit)
    override fun isMovePossible(sqFrom: Square, sqTo: Square, board: Board): Boolean {
        return if (sqTo.getPiece() == null){
            false
        } else diagonalMoveRule.isMovePossible(sqFrom, sqTo)
    }
}