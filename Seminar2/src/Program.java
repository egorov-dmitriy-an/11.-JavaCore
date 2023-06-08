public class Program {

    public static final char MAN_MOVE = 'X';
    public static final char COMP_MOVE = 'O';
    public static final char EMPTY_CELL = '*';


    public static void main(String[] args) {
        do {
            Init.initField();
            Print.printField();
            while (true) {
                Move.humanMove();
                Print.printField();
                if (Check.checkGame(MAN_MOVE, "Victory!"))
                    break;
                Move.aiMove();
                Print.printField();
                if (Check.checkGame(COMP_MOVE, "Loser!"))
                    break;
            }
            System.out.println("Play again? (Y - yes)");
        } while (Move.SCANNER.next().equalsIgnoreCase("Y"));
    }
}