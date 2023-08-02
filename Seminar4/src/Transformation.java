public class Transformation {
    public static void sum(String[][] array) {
        int sum = 0;
        for (String[] arr : array) {
            for (String str : arr) {
                sum += Integer.parseInt(str);
            }
        }
        System.out.println("Summa = " + sum);
    }
}