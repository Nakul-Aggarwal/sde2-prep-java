public class FactoryPattern {
    // TODO: Implement Factory Pattern

    // Pseudo code:
    // - interface Shape { void draw(); }
    // - class Circle implements Shape
    // - class Square implements Shape
    // - class ShapeFactory { public static Shape createShape(String type) { if "circle" return new Circle(); else new Square(); } }

    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() { System.out.println("Drawing Circle"); }
    }

    static class Square implements Shape {
        public void draw() { System.out.println("Drawing Square"); }
    }

    static class ShapeFactory {
        public static Shape createShape(String type) {
            // TODO: implement
            return null;
        }
    }

    // TODO: Implement
}