public class BillGenerator {

    String buyerName;
    String buyerAddress;
    String contact;
    String email;
    String[][] products;

    // Constructor to initialize buyer info and products
    public BillGenerator(String name, String address, String contact, String email, String[][] products) {
        this.buyerName = name;
        this.buyerAddress = address;
        this.contact = contact;
        this.email = email;
        this.products = products;
    }

    // Method to print the bill
    public void generateBill() {
        int subtotal = 0;

        System.out.println("=== Bill ===");
        System.out.println("Buyer:   " + buyerName);
        System.out.println("Address: " + buyerAddress);
        System.out.println("Contact: " + contact);
        System.out.println("Email:   " + email);
        System.out.println("----------------------------------------");
        System.out.printf("%-25s %-20s %-20s %-20s\n", "Product", "Qty", "Unit", "Total");

        for (String[] item : products) {
            String name = item[0];
            int qty = Integer.parseInt(item[1]);
            int price = Integer.parseInt(item[2]);
            int total = qty * price;
            subtotal += total;

            System.out.printf("%-15s %-10d %-10d %-10d\n", name, qty, price, total);
        }

        System.out.println("----------------------------------------");
        System.out.println("Subtotal:       " + subtotal);
        System.out.println("Final Total:    " + subtotal);
        System.out.println("Transaction ID: TXN00123");
        System.out.println("Date:           2025-05-11");
        System.out.println("Payment Method: UPI");
    }

    // Main method to run the program
    public static void main(String[] args) {
        String[][] products = {
            {"Laptop", "1", "50000"},
            {"Mouse", "2", "500"},
            {"Keyboard", "1", "1500"}
        };

        BillGenerator bill = new BillGenerator(
            "John Doe",
            "123 Maple Street, City, Country",
            "+91 9870654312",
            "john.doe@email.com",
            products
        );

        bill.generateBill();
    }
}
