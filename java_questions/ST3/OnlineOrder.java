package java_questions.ST3;

class OnlineOrder {

    // Instance variables
    private String orderId;
    private String customerName;
    private double pricePerUnit;
    private int quantity;

    // Static variable to count objects
    private static int objectCount = 0;

    // Constructor
    public OnlineOrder(String orderId, String customerName,
                       double pricePerUnit, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        objectCount++; // count objects
    }

    // Total amount
    public double totalAmount() {
        return pricePerUnit * quantity;
    }

    // Discount price
    public double discountPrice(double percent) {
        double total = totalAmount();
        double discount = total * percent / 100;
        return total - discount;
    }

    // Return number of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    // toString method
    @Override
    public String toString() {
        double finalAmount = discountPrice(10); // example 10% discount
        return "{customerName:" + customerName +
               " , orderid:" + orderId +
               " ,quantity: " + quantity +
               " , TotalAmountAfterDiscount:" +
               String.format("%.2f", finalAmount) + "}";
    }
}
