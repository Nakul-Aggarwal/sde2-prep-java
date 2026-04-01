public class Singleton {
    // TODO: Implement Singleton Pattern

    // Pseudo code:
    // - private static Singleton instance;
    // - private Singleton() {}
    // - public static Singleton getInstance() { if (instance == null) instance = new Singleton(); return instance; }

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // TODO: Add thread safety if needed
}