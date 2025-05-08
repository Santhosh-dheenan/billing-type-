import java.util.*;

class Sample {
    static void myMethod(String name, int rate) {
        System.out.println("Product: " + name);
        System.out.println("Rate: " + rate);

        Scanner scan = new Scanner(System.in);
        System.out.print("How many do you want to buy: ");
        int quantity = scan.nextInt();

        int total = rate * quantity;
        System.out.println("Total = " + total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Bingo");
        System.out.println("2. Lollipop");
        System.out.print("Enter the menu number (only one): ");
        int num = scan.nextInt();

        if (num == 1) {
            myMethod("Bingo Chips", 10);
        } else if (num == 2) {
            myMethod("Lollipop", 5);
        } else {
            System.out.println("Invalid option selected.");
        }

        System.out.println("Welcome to our shop!");
    }
}
