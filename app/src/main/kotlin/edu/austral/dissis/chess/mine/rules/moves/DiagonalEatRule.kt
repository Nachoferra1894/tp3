package rules.moves

import edu.austral.dissis.chess.mine.game.PieceController
import pieces.Piece
import squares.Square

class DiagonalEatRule(override val limit: Int = 0,moveType: MoveType) : MoveRule {
    private val diagonalMoveRule = DiagonalMoveRule(limit,moveType)

    override fun isMovePossible(sqFrom: Square, sqTo: Square, pieceInSqTo: Piece?): Boolean {
        return if (pieceInSqTo == null){
            false
        } else diagonalMoveRule.isMovePossible(sqFrom, sqTo,pieceInSqTo)
    }

    override fun getRowMoveType(): Int {
        return 1
    }

    override fun getColMoveType(): Int {
        return 1
    }
}