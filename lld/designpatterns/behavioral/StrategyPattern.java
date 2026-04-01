public class StrategyPattern {
    // TODO: Implement Strategy Pattern

    // Pseudo code:
    // - interface PaymentStrategy { void pay(int amount); }
    // - class CreditCardPayment implements PaymentStrategy
    // - class PayPalPayment implements PaymentStrategy
    // - class ShoppingCart { private PaymentStrategy strategy; setStrategy(); checkout() { strategy.pay(amount); } }

    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }

    static class ShoppingCart {
        private PaymentStrategy paymentStrategy;

        public void setPaymentStrategy(PaymentStrategy strategy) {
            this.paymentStrategy = strategy;
        }

        public void checkout(int amount) {
            paymentStrategy.pay(amount);
        }
    }

    // TODO: Complete
}