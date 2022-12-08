import java.util.Scanner;

class test{
 public static Scanner scanner = new Scanner(System.in);

    public static String calcOperationType(){

        String operator = "";
        while(true){
            String input = scanner.next();

            switch (input){
                case("+"):
                case("-"):
                case("*"):
                case("/"):
                case("%"): operator = input;
                            return operator;
                default:
                    System.out.println("This is not a valid operator, please input +, -, *, /, %");
                    
            }
        }
        }
    
    public static void main(String[] args) {



        System.out.println("Enter 1st operand: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Operator: ");
        String op = calcOperationType();
        System.out.println("Enter 2nd operand: ");
        int num2 = scanner.nextInt();

        String ans = num1 + op + num2;
        System.out.println("Sume = " + ans);


    }

}