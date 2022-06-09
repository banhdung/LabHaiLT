package j1.s.p0009;

public class J1SP0009 {

    public static void main(String[] args) {
        int n = 45;
        System.out.println("The 45 sequence fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }

    public static int Fibonacci(int term) {
        if (term < 0) {
            return -1;
        } else if (term == 0 || term == 1) {
            return term;
        } else {
            return Fibonacci(term - 1) + Fibonacci(term - 2);
        }
    }

}
