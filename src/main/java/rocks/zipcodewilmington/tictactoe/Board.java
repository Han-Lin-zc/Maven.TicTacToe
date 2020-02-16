package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

public class Board {

    char topLeft;
    char topMid;
    char topRight;

    char midLeft;
    char midMid;
    char midRight;

    char botLeft;
    char botMid;
    char botRight;

    public Board(Character[][] matrix) {
        topLeft = matrix[0][0];
        topMid = matrix[0][1];
        topRight = matrix[0][2];

        midLeft = matrix[1][0];
        midMid = matrix[1][1];
        midRight = matrix[1][2];

        botLeft = matrix[2][0];
        botMid = matrix[2][1];
        botRight = matrix[2][2];


    }

    public Boolean isInFavorOfX() {
        if (topLeft == 'X' && topLeft == topMid && topMid == topRight ||
                midLeft == 'X' && midLeft == midMid && midMid == midRight ||
                botLeft == 'X' && botLeft == botMid && botMid == botRight ||
                topLeft == 'X' && topLeft == midLeft && midLeft == botLeft ||
                topMid == 'X' && topMid == midMid && midMid == botMid ||
                topRight == 'X' && topRight == midRight && midRight == botRight ||
                topLeft == 'X' && topLeft == midMid && midMid == botRight ||
                topRight == 'X' && topRight == midMid && midMid == botLeft) {
            return true;
        }
        return false;
    }


    public Boolean isInFavorOfO() {
        if (topLeft == 'O' && topLeft == topMid && topMid == topRight ||
                midLeft == 'O' && midLeft == midMid && midMid == midRight ||
                botLeft == 'O' && botLeft == botMid && botMid == botRight ||
                topLeft == 'O' && topLeft == midLeft && midLeft == botLeft ||
                topMid == 'O' && topMid == midMid && midMid == botMid ||
                topRight == 'O' && topRight == midRight && midRight == botRight ||
                topLeft == 'O' && topLeft == midMid && midMid == botRight ||
                topRight == 'O' && topRight == midMid && midMid == botLeft) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        String winnerX = "X";
        String winnerO = "O";
        String isDraw = "";

        if (isInFavorOfX()) {
            return winnerX;
        } else if (isInFavorOfO()) {
            return winnerO;
        }
        return isDraw;
    }
}


