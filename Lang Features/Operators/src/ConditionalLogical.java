public class ConditionalLogical {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 10;

        // CONDITIONAL LOGICAL OPERATORS
        // RHS executes only if LHS is true
        // AND
        if (firstNumber > 10 && secondNumber > 10) {
            System.out.println("Both the numbers are greater than 10");
        } else {
            System.out.println("One of the number is not greater than 10");
        }

        // OR
        if (firstNumber > 10 || secondNumber > 10) {
            System.out.println("Either of the number is greater than 10");
        } else {
            System.out.println("Both the numbers are not greater than 10");
        }
    }
}
