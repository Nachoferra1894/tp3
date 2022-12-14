package squares

import pieces.Piece

class PositionSquare(private val row: Int,private val column: Int): Square {
    private var piece: Piece? = null

    override fun getPiece(): Piece? {
        return piece
    }

    override fun movePieceToThisSquare(pz: Piece){
        this.piece = pz
    }

    override fun movePieceFromThisSquare(): Piece? {
        val newPiece = this.piece
        this.piece = null
        return newPiece

    }

    override fun getRow(): Int {
        return row
    }

    override fun getColumn(): Int {
        return column
    }
}