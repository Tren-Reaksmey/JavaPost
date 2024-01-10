
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String ShortDate ="";
        String [] Year ;
        label:
        while(!ShortDate.equals("Exit")){
            System.out.print("Enter Date your want to convert(YYYY-MM-DD) or Exit :");
            ShortDate = input.next();
             Year = ShortDate.split("-");
            switch (Year[1]) {
                case "1":
                    Year[1] = "January";
                    break;
                case "2":
                    Year[1] = "February";
                    break;
                case "3":
                    Year[1] = "March";
                    break;
                case "4":
                    Year[1] = "April";
                    break;
                case "5":
                    Year[1] = "May";
                    break;
                case "6":
                    Year[1] = "June";
                    break;
                case "7":
                    Year[1] = "July";
                    break;
                case "8":
                    Year[1] = "August";
                    break;
                case "9":
                    Year[1] = "September";
                    break;
                case "10":
                    Year[1] = "October";
                    break;
                case "11":
                    Year[1] = "November";
                    break;
                case "12":
                    Year[1] = "December";
                    break;
                default:
                    System.out.println("This is not the month");
                    break label;
            }
            System.out.println("FullDate:"+ Year[1]+" "+Year[2]+","+Year[0]);
        }


    }
}