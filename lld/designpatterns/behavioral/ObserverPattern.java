import java.util.*;

public class ObserverPattern {
    // TODO: Implement Observer Pattern

    // Pseudo code:
    // - interface Observer { void update(String message); }
    // - interface Subject { void attach(Observer); void notifyAllObservers(); }
    // - class ConcreteSubject implements Subject { private List<Observer> observers; notifyAllObservers() { for each observer.update() } }
    // - class ConcreteObserver implements Observer

    interface Observer {
        void update(String message);
    }

    interface Subject {
        void attach(Observer observer);
        void detach(Observer observer);
        void notifyAllObservers();
    }

    static class ConcreteSubject implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String state;

        public void attach(Observer observer) {
            observers.add(observer);
        }

        public void detach(Observer observer) {
            observers.remove(observer);
        }

        public void notifyAllObservers() {
            for (Observer observer : observers) {
                observer.update(state);
            }
        }

        public void setState(String state) {
            this.state = state;
            notifyAllObservers();
        }
    }

    static class ConcreteObserver implements Observer {
        private String name;

        public ConcreteObserver(String name) {
            this.name = name;
        }

        public void update(String message) {
            System.out.println(name + " received: " + message);
        }
    }

    // TODO: Complete
}