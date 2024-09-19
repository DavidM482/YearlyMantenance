import java.util.Scanner;

public class YearlyMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int autumnCost;
        int winterCost;
        int springCost;
        int summerCost;
        int yearlyCost;

        //process
        System.out.println("What is your home maintenance cost for the Autumn season?");
        autumnCost = scan.nextInt();

        System.out.println("What is your home maintenance cost for the Winter season?");
        winterCost = scan.nextInt();

        System.out.println("What is your home maintenance cost for the Spring season?");
        springCost = scan.nextInt();

        System.out.println("What is your home maintenance cost for the Summer season?");
        summerCost = scan.nextInt();

        yearlyCost = autumnCost + winterCost + springCost + summerCost;
        System.out.println("Your yearly maintenance cost is " + yearlyCost + ".");
    }
}