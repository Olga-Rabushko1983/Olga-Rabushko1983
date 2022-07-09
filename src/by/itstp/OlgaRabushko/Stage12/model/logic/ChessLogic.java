package by.itstp.OlgaRabushko.Stage12.model.logic;

public class ChessLogic {
    public static boolean checkRock(int x1, int x2, int y1, int y2) {
        return (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2);
    }

    public static boolean checkKing(int x1, int x2, int y1, int y2) {
        return ((x1 != x2 && y1 != y2) && ((x2 == x1 - 1 && y2 == y1 + 1) ||
                (x2 == x1 - 1 && y2 == y1 - 1) || (x2 == x1 + 1 && y2 == y1 - 1) || (x2 == x1 + 1 && y2 == y1 + 1)))
                || (x2 == x1 - 1 && y2 == y1) || (x2 == x1 && y2 == y1 - 1) || (x2 == x1 && y2 == y1 + 1)
                || (x2 == x1 + 1 && y2 == y1);
    }

    public static boolean checkBishop(int x1, int x2, int y1, int y2) {
        return (x1!=x2&&y1!=y2)&&((x1 - y1) == (x2 - y2) || (x1 + y1) == (x2 + y2));
    }

    public static boolean checkQueen (int x1, int x2, int y1, int y2) {
        return (y1== y2 && x1 != x2) || (y1 != y2 && x1 == x2) ||
                ((x1 != x2 && y1 != y2) &&(Math.abs(x2 - x1) == Math.abs(y2 - y1)))
                || ((x1 != x2 && y1 != y2) &&((x1 + x2) == (y1 + y2)));
    }

    public static boolean checkKnight(int x1, int x2, int y1, int y2) {
        return (x1 != x2 && y1 != y2) && ((x2 == x1 + 1 && y2 == y1 - 2) || (x2 == x1 + 1 && y2 == y1 + 2) ||
                (x2 == x1 + 2 && y2 == y1 - 1) || (x2 == x1 + 2 && y2 == y1 + 1) || (x2 == x1 - 1 && y2 == y1 + 2)
                || (x2 == x1 - 2 && y2 == y1 + 1) || (x2 == x1 - 2 && y2 == y1 - 1) || (x2 == x1 - 1 && y2 == y1 - 2));
    }}

