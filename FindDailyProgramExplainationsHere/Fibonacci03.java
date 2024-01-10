public class Fibonacci03 {
    public static void main(String[] args) {
        int n = 20; // Change this value to the desired number of Fibonacci numbers
        printFibonacci(n);
    }

    static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");

        

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
