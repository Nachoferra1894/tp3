package rules.moves

import squares.Board
import squares.Square

class VerticalMoveRule(override var limit: Int = 0) : MoveRule {
    override fun isMovePossible(sqFrom: Square, sqTo: Square, board: Board): Boolean {
        val difference = sqFrom.getRow() - sqTo.getRow()
        val limitValidation = if (limit == 0) true else (kotlin.math.abs(difference) >= limit)
        return (sqFrom.getColumn() == sqTo.getColumn() && limitValidation)
    }

    override fun getRowMoveType(): Int {
        return 1
    }

    override fun getColMoveType(): Int {
        return 0
    }

    fun changeLimit(newLimit: Int){
        limit = newLimit
    }
}