public class DecoratorPattern {
    // TODO: Implement Decorator Pattern

    // Pseudo code:
    // - interface Shape { void draw(); }
    // - class Circle implements Shape
    // - abstract class ShapeDecorator implements Shape { protected Shape decoratedShape; }
    // - class RedShapeDecorator extends ShapeDecorator { draw() { decoratedShape.draw(); setRedBorder(); } }

    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() { System.out.println("Shape: Circle"); }
    }

    static abstract class ShapeDecorator implements Shape {
        protected Shape decoratedShape;

        public ShapeDecorator(Shape decoratedShape) {
            this.decoratedShape = decoratedShape;
        }

        public void draw() {
            decoratedShape.draw();
        }
    }

    static class RedShapeDecorator extends ShapeDecorator {
        public RedShapeDecorator(Shape decoratedShape) {
            super(decoratedShape);
        }

        public void draw() {
            decoratedShape.draw();
            setRedBorder(decoratedShape);
        }

        private void setRedBorder(Shape decoratedShape) {
            System.out.println("Border Color: Red");
        }
    }

    // TODO: Complete
}