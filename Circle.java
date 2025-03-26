public class Circle {
    public static double calculateArea(final double radius) {
        // Attempt to modify the final parameter
        // radius = radius + 1;  // Uncommenting this line will cause a compilation error

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(5.0));
    }
}
