public class Check {
    static boolean checkWin(char c) {
        if (Init.field[0][0] == c && Init.field[0][1] == c && Init.field[0][2] == c) return true;
        if (Init.field[1][0] == c && Init.field[1][1] == c && Init.field[1][2] == c) return true;
        if (Init.field[2][0] == c && Init.field[2][1] == c && Init.field[2][2] == c) return true;

        if (Init.field[0][0] == c && Init.field[1][1] == c && Init.field[2][2] == c) return true;
        if (Init.field[0][2] == c && Init.field[1][1] == c && Init.field[2][0] == c) return true;

        if (Init.field[0][0] == c && Init.field[1][0] == c && Init.field[2][0] == c) return true;
        if (Init.field[0][1] == c && Init.field[1][1] == c && Init.field[2][1] == c) return true;
        if (Init.field[0][2] == c && Init.field[1][2] == c && Init.field[2][2] == c) return true;

        return false;
    }

    static boolean checkDraw() {
        for (int x = 0; x < Init.SizeX; x++) {
            for (int y = 0; y < Init.SizeY; y++)
                if (Move.isCellEmpty(x, y)) return false;
        }
        return true;
    }

    static boolean checkGame(char c, String str) {
        if (checkWin(c)) {
            System.out.println(str);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}
