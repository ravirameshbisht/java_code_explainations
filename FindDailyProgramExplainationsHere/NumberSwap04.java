public class NumberSwap04 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b;//a = 5+10 = 15
        b = a - b;//b = 15–10 = 5
        a = a - b;//a = 15–5 = 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
