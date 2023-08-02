public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array2 = new String[][]{{"1", "2", "3"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array3 = new String[][]{{"X", "3", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        Check.checkLength(array);
        //Check.checkLength(array2);
        Check.checkLength(array3);
        Check.checkArray(array);
        //Check.checkArray(array3);
        Transformation.sum(array);
    }
}