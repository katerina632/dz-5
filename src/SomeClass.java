public class SomeClass {

    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int fourthNumber = 4;

        int sum1 = firstNumber + secondNumber;
        int sum2 = thirdNumber + fourthNumber;

        System.out.println(sum1 > sum2 ? "true" : "false");

        sum1++;
        sum2 -= 2;

        System.out.println(sum1 > sum2 ? "true" : "false");
        System.out.println(sum1%2==0 || sum2%2==0 ? "true" : "false");

    }
}
