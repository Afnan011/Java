package RecursionExamples;

public class RecursionEx1 {

public static void fact(int n){
    int k = 1;
    for (int i = 2; i <=n ; i++) {
        k = k * i;
    }
    System.out.println(n+"! = " + k);
}

public static void f(int n){
    if (n <= 1){
        return;
    }
    f(n-1);
    System.out.println(n);
    f(n-1);
}

    public static void main(String[] args) {

//        int n = 5;
//        fact(n);

        f(5);


    }

}
