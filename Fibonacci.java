//Sequência de Fibonacci

//Exemplo dos 10 primeiros termos da sequência: 0,1, 1, 2, 3, 5, 8, 13, 21, 34 

class Fibonacci {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
