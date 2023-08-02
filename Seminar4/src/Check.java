public class Check {

    public static boolean checkType(String number) {
        try {
            int result = Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void checkLength(String[][] array) {
        RuntimeException MyArraySizeException = new RuntimeException("The array has a size other than 4x4");
        if (array.length != 4) {
            throw MyArraySizeException;
        }
        for (String[] arr : array) {
            if (arr.length != 4) {
                throw MyArraySizeException;
            }
        }
    }

    public static void checkArray(String[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!checkType(array[i][j])) {
                    RuntimeException MyArrayDataException = new RuntimeException("There is incorrect data in cell (" + i + ", " + j + ")");
                    throw MyArrayDataException;
                }
            }
        }
    }
}