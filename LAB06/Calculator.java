import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
         /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */

        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        num1=scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("Input the operator: ");
        operator=scanCalc.nextLine();
        System.out.println("Input the second number: ");
        num2=scanCalc.nextInt();

        // Decide on the operation to perform 
        /**
    
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
        switch(operator){
            case "+":
                System.out.println(num1+operator+num2+"= "+ add(num1, num2));
                break;
            case "x":
                System.out.println(num1+operator+num2+"= "+ multiply(num1, num2));
                break;
            case "/":
                System.out.println(num1+operator+num2+"= "+ divide(num1,num2));
                break;
            case "-":
                 System.out.println(num1+operator+num2+"= "+ subtract(num1,num2));
                 break;

        }
    }

    public String add(int a, int b) {
        /**
         * Enter logic
         */
        int addition=a+b;

        return addition+"";
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
        int substraction= a-b;
        return substraction+"";
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
        int multiplication=a*b;
        return multiplication+""; 
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
        int division= a/b;
        return division+"";

    }
    

}
