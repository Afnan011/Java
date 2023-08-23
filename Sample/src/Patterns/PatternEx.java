package Patterns;

public class PatternEx {

    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        pattern4(5);

    }

    private static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    private static void pattern2(int n) {

        for (int row = 0; row < n*2; row++) {

            int col = row <= n ? row : n*2-row;
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    private static void pattern3(int n) {

        for (int row = 0; row < n*2; row++) {

            int noCols = row <= n ? row : n*2-row;

            int noSpace = n - noCols;
            for (int i = 0; i < noSpace; i++) {
                System.out.print(" ");
            }

            for (int j = 0; j < noCols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /*
             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *

         */

    }


    private static void pattern4(int n) {

        for (int row = 0; row < n*2; row++) {


            int noCols = row < n ? n-row : row-n+1;


            int noSpace = n - noCols;
            for (int i = 0; i < noSpace; i++) {
                System.out.print(" ");
            }

            for (int j = 0; j < noCols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /*
         * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *

         */

    }
}
