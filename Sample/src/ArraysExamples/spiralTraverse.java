package ArraysExamples;

import java.util.ArrayList;
import java.util.List;

public class spiralTraverse {



    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Traverse1 t1 = new Traverse1();

        t1.spiralOrder(arr);

    }

}

class Traverse1 {

    public static void spiralOrder(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        List<Integer> res = new ArrayList<>();


        int rowStart = 0;
        int rowEnd = m-1;

        int colStart = 0;
        int colEnd = n-1;

        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            //traverse right
            for (int i = colStart; i <= colEnd; i++) {
                    res.add(arr[rowStart][i]);
            }
            rowStart++;

            //traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                res.add(arr[i][colEnd]);
            }
            colEnd--;

            //traverse left
            for (int i = colEnd; i >= colStart; i--) {
                res.add(arr[rowEnd][i]);
            }
            rowEnd--;

            //traverse right
            for(int i = rowEnd; i >= rowStart; i--)
            {
                res.add(arr[i][colStart]);
            }
            colStart++;

        }



        System.out.println(res);
    }
}
