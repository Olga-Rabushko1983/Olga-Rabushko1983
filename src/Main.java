import by.itstp.OlgaRabushko.Stage12.model.logic.ChessLogic;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input x1,x2 and y1,y2: ");

        int x1 = scanner.nextInt();
        System.out.println("x1 = " + x1);
        int x2 = scanner.nextInt();
        System.out.println("x2 = " + x2);
        int y1 = scanner.nextInt();
        System.out.println("y1 = " + y1);
        int y2 = scanner.nextInt();
        System.out.println("y2 = " + y2);


        boolean Result = ChessLogic.checkRock(x1, x2, y1, y2);
        String msg = Result ? "Yes" : "No";
        System.out.println(msg);

        boolean Result1 = ChessLogic.checkKing(x1, x2, y1, y2);
        String msg1 = Result1 ? "Yes" : "No";
        System.out.println(msg1);

        boolean Result2 = ChessLogic.checkBishop(x1, x2, y1, y2);
        String msg2 = Result2 ? "Yes" : "No";
        System.out.println(msg2);

        boolean Result3 = ChessLogic.checkQueen(x1, x2, y1, y2);
        String msg3 = Result3 ? "Yes" : "No";
        System.out.println(msg3);

        boolean Result4 = ChessLogic.checkKnight(x1, x2, y1, y2);
        String msg4 = Result4 ? "Yes" : "No";
        System.out.println(msg4);
    }}
