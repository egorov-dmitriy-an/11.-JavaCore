public class Init {
    static int SizeX;
    static int SizeY;
    public static char[][] field;

    static void initField() {
        SizeX = 3;
        SizeY = 3;
        field = new char[SizeX][SizeY];
        for (int x = 0; x < SizeX; x++) {
            for (int y = 0; y < SizeY; y++) {
                field[x][y] = Program.EMPTY_CELL;
            }
        }
    }
}