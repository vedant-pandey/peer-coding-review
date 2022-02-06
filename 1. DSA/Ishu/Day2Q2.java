public class Day2Q2 {
    public static int magicNumber(int number) {
        int power = 1;
        int sum = 0;
        while (number > 0) {
            power = power * 5;
            if ((number & 1) == 1) {
                sum = sum + power;
            }
            number >>= 1;
        }
        return sum;
    }

    public static void main(String args[]) {
        int number = 10;
        int result = magicNumber(number);
        System.out.println("The " + number + " Magic Number is : " + result);
        System.out.print
        int expectedResult = 650;
        if (result == expectedResult) {
            System.out.println("The answer is correct.");
        }
    }
}
