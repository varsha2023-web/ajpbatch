package lab01;
import java.util.Scanner;

public class GroceryBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per unit: ");
        double pricePerUnit = sc.nextDouble();

        System.out.print("Enter membership status (1 = member, 0 = non-member): ");
        int isMember = sc.nextInt();

        // Step 1: Subtotal
        double subtotal = quantity * pricePerUnit;

        // Step 2: Discount
        double discount = 0;
        if (isMember == 1) {
            discount = subtotal * 0.10; // 10% discount
        }

        double amountAfterDiscount = subtotal - discount;

        // Step 3: GST
        double gstRate;
        if (amountAfterDiscount > 500) {
            gstRate = 0.05; // 5% GST
        } else {
            gstRate = 0.12; // 12% GST
        }

        double gstAmount = amountAfterDiscount * gstRate;

        // Step 4: Final total
        double finalTotal = amountAfterDiscount + gstAmount;

        // Output
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Item Name: " + itemName);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("GST Amount: %.2f\n", gstAmount);
        System.out.printf("Final Total: %.2f\n", finalTotal);
    }
}