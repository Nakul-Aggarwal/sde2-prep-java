public class ChainOfResponsibility {
    // TODO: Implement Chain of Responsibility

    // Pseudo code:
    // - abstract class Logger { protected Logger next; public void setNext(Logger next); abstract void logMessage(int level, String message); }
    // - class ConsoleLogger extends Logger { logMessage() { if level >= INFO print; else next.logMessage() } }
    // - Similarly for ErrorLogger, FileLogger

    abstract class Logger {
        public static int INFO = 1;
        public static int DEBUG = 2;
        public static int ERROR = 3;

        protected Logger nextLogger;

        public void setNextLogger(Logger nextLogger) {
            this.nextLogger = nextLogger;
        }

        public void logMessage(int level, String message) {
            if (this.level <= level) {
                write(message);
            }
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }

        abstract protected int getLevel();
        abstract protected void write(String message);
    }

    class ConsoleLogger extends Logger {
        public ConsoleLogger(int level) {
            this.level = level;
        }

        protected int getLevel() { return level; }
        protected void write(String message) { System.out.println("Console: " + message); }
    }

    // TODO: Add ErrorLogger, FileLogger
}