public class Enum {
    enum Color {
        RED, GREEN, BLUE;

        // Method in the enum
        public void displayInfo() {
            System.out.println("This is a " + this.name() + " color.");
        }
    }

    public static void main(Strings[] args) {
        // Calling the method on each enum constant
        Color.RED.displayInfo();
        Color.GREEN.displayInfo();
        Color.BLUE.displayInfo();
    }
}
