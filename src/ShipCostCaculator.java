/*
An application program where the user enters the price of an item and the program computes shipping costs. If the item price is $100 or more, then shipping is free otherwise it is 2% of the price.
The program should output the shipping cost and the total price.
Test runs: (insert the output widow copies here for the test runs)
- valid input less than 100

- valid input greater than 100
 */
import java.util.Scanner;

public class ShipCostCaculator {
    public static void main(String[] args) {
        double cost;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the price of the item: ");
        cost = input.nextDouble();
        System.out.println("cost is " + cost);

        if (cost >= 100) {
            System.out.println("Shipping cost is free");
            System.out.println("Total price is " + cost);
        }
        else {
            double ShippingCost = cost * 0.02;
            double TotalPrice = cost + ShippingCost;
            System.out.println("Shipping cost is " + ShippingCost);
            System.out.println("Total price is " + TotalPrice);
        }
    }
}