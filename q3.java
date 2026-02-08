class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        System.out.println("IT25013589");
        
        EvenOddNumber myNum = new EvenOddNumber();
        boolean check = myNum.findEvenOrOdd(10);

        if (check == true) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}