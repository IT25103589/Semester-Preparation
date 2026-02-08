class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }
}

public class q5 {
    public static void main(String[] args) {
        System.out.println("IT25013589");
        
        Calculator c = new Calculator();

        int m1 = c.multiply(3, 4);
        int m2 = c.multiply(5, 7);
        int add1 = c.add(m1, m2);
        int result1 = c.square(add1);
        System.out.println("Result 1: " + result1);

        int a1 = c.add(4, 7);
        int s1 = c.square(a1);
        int a2 = c.add(8, 3);
        int s2 = c.square(a2);
        int result2 = c.add(s1, s2);
        System.out.println("Result 2: " + result2);
    }
}