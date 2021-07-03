public class Logical {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 10;

        // LOGICAL OPERATORS
        if (firstNumber > 10 & secondNumber > 10) {
            System.out.println("Both the numbers are greater than 10");
        } else {
            System.out.println("One of the number is not greater than 10");
        }

        // OR
        if (firstNumber > 10 | secondNumber > 10) {
            System.out.println("Either of the number is greater than 10");
        } else {
            System.out.println("Both the numbers are not greater than 10");
        }

        // EXCLUSIVE OR - Either of the value must be true or else expression will return false
        boolean firstBool = true;
        boolean secondBool = false;
        boolean thridBool = true;
        System.out.print("XOR : ");
        System.out.println(firstBool ^ secondBool);
        System.out.print("XOR : ");
        System.out.println(firstBool ^ thridBool);

    }
}
