
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String str ;
        Scanner input = new Scanner(System.in);
      System.out.println("Enter Unicode ID:");
      str= input.nextLine();
    //  System.out.println(str);

      String [] str1= str.split(",");
         String [] part1= str1[0].split("<");
         String ID= part1[0].substring(5);
         String IDcard = ID.substring(0,9);
         System.out.println("ID: "+IDcard);

      String [] part2 =str1[1].split("<");
          String [] Date= part2[0].split("<");
          String bod=Date[0].substring(0,6);
             String bodyear=bod.substring(0,2);
               int year =Integer.parseInt(bodyear);
             String bodmonth=bod.substring(2,4);
             String bodday=bod.substring(4,6);

          String sex=Date[0].substring(7,8);

          String exp=Date[0].substring(8,14);
              String expyears=exp.substring(0,2);
              expyears=20+expyears;
              String expmonths=exp.substring(2,4);
              String expdays=exp.substring(4,6);

      String [] part3 =str1[2].split("<");
          String lname=part3[0];
          String fname=part3[2];

      System.out.println("BOD:"+bodday+"/"+bodmonth+"/"+(year>50?19+bodyear:20+bodyear));
      System.out.println("Sex: "+sex);
      System.out.println("Last Name: "+lname);
      System.out.println("First Name: "+fname);
      System.out.println("Exp Date:"+expdays +"/"+expmonths+"/"+expyears);
    }
}