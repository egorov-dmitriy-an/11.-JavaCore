public class Print {
    static void printField() {
        System.out.print(" ");
        for (int i = 0; i < Init.SizeY * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < Init.SizeX; i++) {
            System.out.print(i + 1 + "|");

            for (int j = 0; j < Init.SizeY; j++)
                System.out.print(Init.field[i][j] + "|");

            System.out.println();
        }

        for (int i = 0; i < Init.SizeY * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
