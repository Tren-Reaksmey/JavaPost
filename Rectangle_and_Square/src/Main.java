import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
      System.out.println("Enter Value :");
        length=input.nextDouble();
      Square obj= new Square(length);
    System.out.println(obj);
    }
}