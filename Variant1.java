package lab0;

public class Variant1 {

 

    /**
     * Integer1.There is the distance L in centimeters.
     *  Using the integer division operation is aimed at finding
     *  the number of complete meters in it (1 m = 100 cm).
     */

    public  int integerTask(int L, int B) {
        if (B == 0) {
            throw new IllegalArgumentException("b shouldn't be equal 0");
        }
        return L / B;
    }

    /**
     * Boolean1. There is an integer A.
     * Check the truth: "The number A is positive."
     */
    public  boolean booleanTask(int A) {
        return A > 0;

    }

    /**
     * If1.There is an integer number. If it is positive, then add 1 to it
     * otherwise don't change it. Print the received number.
     */
    public int ifTask(int A) {
        if (A > 0) {
            A++;
        }
        return A;
    }


    /**
     * Case1.There is an integer number in the range 1-7.
     * Output a line - the name of the day of the week
     * corresponding to the corresponding number (1 - Monday, 2 - Tuesday, etc.).
     */
    public String caseTask(int n) {
        assert n >= 1 && n <= 7 : "incorrect number of weekday";
        switch (n) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                throw new IllegalArgumentException("there's no such day") ;
        }
    }


    /**
     *
     *For1. There are integer numbers K and N (N > 0).
     * Output N times the number K.
     */
    public int forTask(int k, int n) {
        assert n > 0: "n should be more than zero";

        for (int i = 0; i < n; i++) {
//            System.out.print(k);
//            System.out.print(' ');
        }
//       System.out.println();
        return n;
    }


    /**
     * While1.There are positive numbers A and B (A > B).
     * The maximum possible number of segments of length B (without overlays)
     * is placed on a segment of length A. Without using the operation of
     * multiplication and division find the length of the unoccupied part of segment A.
     */
    public  int whileTask(int A, int B) {

        int temp = A;
        if (temp < B) {
            throw new AssertionError(" A should be more than B");
        }
        while (temp >= 0) {
            temp -= B;
        }
        return A - B;
    }

    /**
     * Array1.There is an integer number N (N > 0). Form and output an integer array of size N,
     * containing N first additional odd numbers: 1, 3, 5, ... .
     */

    public int[] arrayTask(int[] array){
        int n = array.length;
        assert n > 0 : "n should be more than 0";
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = 1 + i * 2;
        }
//        for (int i = 0; i < n; ++i)
//            System.out.println("a[" + i + "]=" + arr[i]);
        return arr;
    }



    /**
     *
     * Matrix1. There are positive integer numbers M and N.
     * Form an integer matrix of size M x N,
     * in which all elements of the I-th row have the value 10*I (I = 1, …, M).
     */
    public int[][] matrixTask(int[][] array) {
        int M = array.length, N = array[0].length;
        assert M > 0 && N > 0 : "M and N should be more than 0";
        int matrix[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 10 * i;
            }
        }
        return matrix;
    }


    public static void main(String args[]) {
    }


}
