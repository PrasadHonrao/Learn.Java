public class Relational {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 10;

        // Relational operators > >= < <= == !=

        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber <= secondNumber);

        secondNumber = secondNumber + 1;
        System.out.println(firstNumber == secondNumber);

        secondNumber = secondNumber + 1;
        System.out.println(firstNumber != secondNumber);

    }
}
