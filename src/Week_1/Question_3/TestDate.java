package Week_1.Question_3;

import java.util.Scanner;

public class TestDate {

    private static int day;
    private static int month;
    private static int year;

    public static void main(String[] args) {


        System.out.println("This is a simple date program \n");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter a day:");
            day = sc.nextInt();
        }while(!(day >= 1 && day <= 31));

        do {
            System.out.println("Please enter a month:");
            month = sc.nextInt();
        }while(!(month >= 1 && month <= 12));

        do {
            System.out.println("Please enter a year");
            year = sc.nextInt();
        }while(!(year >= 1940 && year <= 2100));


        Date date1 = new Date(day, month, year);

        System.out.println("The date you entered was: " + date1);
    }
}
