import java.util.Scanner;
public class fibonaccirekursif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input jumlah suku
        System.out.print("Masukkan jumlah suku Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");

        int i = 0;
        if (n > 0) {
            do {
                System.out.print(fib(i));

                if (i != n - 1) System.out.print(", ");
                i++;
            } while (i < n);
        }

        sc.close();
    }

    // Fungsi rekursif Fibonacci
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}