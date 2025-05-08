import java.util.*;

class Sample {
    static int myMethod(String name, int rate) {
        System.out.println("Product: " + name);
        System.out.println("Rate: " + rate);

        Scanner scan = new Scanner(System.in);
        System.out.print("How many do you want to buy: ");
        int quantity = scan.nextInt();

        int total = rate * quantity;
        System.out.println("Product Total = " + total);
        return total; // Return product total
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int grandTotal = 0; // Running total for all products

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Bingo");
            System.out.println("2. Lollipop");
            System.out.println("3. Parle-g");
            System.out.print("Enter the menu number (only one): ");
            int num = scan.nextInt();

            int productTotal = 0;

            if (num == 1) {
                productTotal = myMethod("Bingo Chips", 10);
            } else if (num == 2) {
                productTotal = myMethod("Lollipop", 5);
            } else if (num == 3){
                productTotal = myMethod("Parle-g",10);
            }else {
                System.out.println("Invalid option selected.");
            }

            grandTotal += productTotal; // Add current product's total to grand total
            System.out.println("Current Grand Total = " + grandTotal);

            System.out.print("\nDo you want to buy another product? (1 = Yes, 0 = No): ");
            choice = scan.nextInt();

        } while (choice == 1);
         
        System.out.println("Final Grand Total = " + grandTotal);
        System.out.println("Thank you! Welcome to our shop again!");
    }
}
