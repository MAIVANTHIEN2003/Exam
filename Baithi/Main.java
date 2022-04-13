package Baithi;

public class Main {
        public static void main(String [] agrs){
                Complex A1 = new Complex(2,6);
                A1.In();

                Complex A2 = new Complex(3, 6);
                A2.In();

                Complex A3 = new Complex();
                A3 = A3.add(A1,A2);
                System.out.println("Sum of: ");
                A3.In();

                A3 = A3.subtract(A1, A2);
                System.out.println("Difference of :");
                A3.In();

                A3 = A3.multiply(A1,A2);
                System.out.println("Multiply: ");
                A3.In();

                A3 = A3.multiply(A1,A2);
                System.out.println("Divide: ");
                A3.In();
        }
}
