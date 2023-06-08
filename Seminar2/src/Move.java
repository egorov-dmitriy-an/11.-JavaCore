import java.util.Random;
import java.util.Scanner;

public class Move {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random random = new Random();


    static void humanMove() {
        int x, y;
        do {
            System.out.print("Please input coor - ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        Init.field[x][y] = Program.MAN_MOVE;
    }

    static void aiMove() {
        int x, y;
        do {
            x = random.nextInt(Init.SizeX);
            y = random.nextInt(Init.SizeY);
        }
        while (!isCellEmpty(x, y));
        Init.field[x][y] = Program.COMP_MOVE;
    }

    static boolean isCellEmpty(int x, int y) {
        return Init.field[x][y] == Program.EMPTY_CELL;
    }

    static boolean isCellValid(int x, int y) {
        return x >= 0 && x < Init.SizeX && y >= 0 && y < Init.SizeY;
    }


}
