import java.util.Scanner;

/**
 * To check whether the entered String is palyndrome or not
 */
public class StringPalyndrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");

        String s = sc.next();
        String newString = "";
        char letter;

        System.out.println("Original string is : " + s);

        for (int i = 0; i < s.length(); i++) {

            letter = s.charAt(i);
            newString = letter + newString;

        }
        System.out.println("Reversed string is : " + newString);
        
        if(s.equalsIgnoreCase(newString)){
            System.out.println("Palyndrome!");
        }
        else{
            System.out.println("Not a palyndrome");
        }


        sc.close();
    }

}