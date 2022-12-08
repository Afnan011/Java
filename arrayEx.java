public class arrayEx {
    

     public static int getCorrectDigits(int[] code, int[] guess) {
        if (code.length != guess.length) {
             throw new IllegalArgumentException("Different lengths");
        }
        
        int correctDigits = 0;
        
        for (int i = 0; i < code.length; i++) {  
                if (guess[i] == code[i]) {
                    correctDigits++;
            }
        }
    
        return correctDigits;
    }

    public static void main(String[] args) {
        
        System.out.println("Hello!");


        int arr1[] =  new int[]{5, 9, 9, 9 };
        int arr2[] =  new int[]{9, 0, 0, 0 };

        int res = getCorrectDigits(arr1, arr2);

        System.out.println("Answers guesses = " + res);

    }

}
