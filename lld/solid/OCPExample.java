public class OCPExample {
    // TODO: Demonstrate Open Closed Principle

    // Pseudo code:
    // - Shape interface: double area()
    // - Circle implements Shape
    // - Rectangle implements Shape
    // - AreaCalculator: double calculateArea(Shape shape) { return shape.area(); }

    interface Shape {
        double area();
    }

    static class Circle implements Shape {
        private double radius;
        // implement area
    }

    static class Rectangle implements Shape {
        private double width, height;
        // implement area
    }

    static class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.area();
        }
    }

    // TODO: Implement
}